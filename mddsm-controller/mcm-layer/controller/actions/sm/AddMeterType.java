package controller.actions.sm;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import types.TypeEnum;
import broker.managers.MHB_TopManager;
import controller.util.BuildCmdHashTable;
import br.inf.ufg.mddsm.controller.manager.ManagerContext;
import br.inf.ufg.mddsm.controller.manager.SignalInstance;
import br.inf.ufg.mddsm.controller.manager.actions.MacroActionInstance;
import br.inf.ufg.mddsm.controller.state.StateHolder;
import br.inf.ufg.mddsm.controller.state.StateTypeManager;

// Without broker access
public class AddMeterType implements MacroActionInstance {
	
	@Override
	public Object execute(ManagerContext ctx, Map<String, Object> params) {
		
		StateTypeManager stateTManager = ctx.getStateManager().getType("TypeController");
		StateHolder state;
		Object devTypeID = params.get("aMeterTypeID");
		
		if(!stateTManager.exists(devTypeID)){
			state = stateTManager.create(devTypeID);
		}else{
			state = stateTManager.get(devTypeID);
		}
		
		state.set("controllerID", params.get("aControllerID"));
		
		//Object id = "SMS01";
		//state = ctx.getStateManager().getType("ScriptManagerState").get(id);
		//MHB_TopManager brokerManager = (MHB_TopManager)state.get("broker");
		//brokerManager.addLocalCtrlr((String)ctrlID, (String)params.get("aName"), TypeEnum.LOAD, params);
		ctx.getMainManager().sendEvent(new SignalInstance("ack"));
		return null;
	}

}
