package br.inf.ufg.mddsm.controller.img;

import java.util.ArrayList;

public class AlloyValidator implements Validator {

	@Override
	public ArrayList<IntentModel> validateModels(ArrayList<IntentModel> models, Object... params) {
		DSC dsc = (DSC) params[0];
		ArrayList<IntentModel> validModels = new ArrayList<IntentModel>();
		
		for (int i = 0; i < models.size(); i++){
			IntentModel model = returnIfValid(models.get(i), dsc);
				if (model != null)
					validModels.add(model);
		}
		return validModels;
	}
	
	public IntentModel returnIfValid(IntentModel model, DSC dsc){
		return model;
	}

}
