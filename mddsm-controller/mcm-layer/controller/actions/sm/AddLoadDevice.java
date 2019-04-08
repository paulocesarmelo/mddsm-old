package controller.actions.sm;

import java.util.Map;
import java.util.Set;

import types.TypeEnum;
import broker.managers.MHB_TopManager;


import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.controller.state.StateHolder;
import br.inf.ufg.mddsm.controller.state.StateTypeManager;


public class AddLoadDevice implements MacroActionInstance {
	//Parei aqui

	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		StateTypeManager stateTManager = ctx.getStateManager().getType("DeviceType");
		StateHolder state;
		Object devID = params.get("aDeviceID");
		
		if(!stateTManager.exists(devID)){
			state = stateTManager.create(devID);
		}else{
			state = stateTManager.get(devID);
		}
		
		state.set("deviceTypeID", params.get("aDeviceType"));
		//Set types = state.getAsSet("typeID");
		//types.add(params.get("aTypeID"));
		
		state = ctx.getStateManager().getType("TypeController").get(params.get("aDeviceType"));
		Object ctrlID = state.get("controllerID");
		
		
		Object id = "SMS01";
		state = ctx.getStateManager().getType("ScriptManagerState").get(id);
		MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		brokerManager.addDevice((String)ctrlID, (String)devID, (String)params.get("aName"), TypeEnum.LOAD, params);
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
