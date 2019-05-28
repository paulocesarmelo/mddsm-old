package br.inf.ufg.mddsm.controller.img;


import java.util.ArrayList;

public class ModelGeneratorTester {
public static void main(String[] args) {

		// Set up DSCs

		DSC sendDSC = new DSC("Send", Type.OPER);
		DSC encryptDSC = new DSC("Encrypt", Type.OPER);
		DSC dummyDSC = new DSC("Dummy", Type.OPER);
		DSC compressDSC = new DSC("Compression", Type.OPER);
		DSC additionalDSC = new DSC("Additional", Type.OPER);
		DSC requiredDSC = new DSC("Required", Type.OPER);
		
		ArrayList<DSC> dependencies1 = new ArrayList<DSC>();	
		dependencies1.add(encryptDSC);
		//dependencies1.add(additionalDSC);
		dependencies1.add(compressDSC);
		
		
		ArrayList<DSC> dependencies2 = new ArrayList<DSC>();	
		dependencies2.add(dummyDSC);
		
		ArrayList<DSC> dependencies3 = new ArrayList<DSC>();	
		dependencies3.add(compressDSC);
		
		ArrayList<DSC> dependencies4 = new ArrayList<DSC>();	
		dependencies4.add(requiredDSC);
		
		Procedure procedure1 = new Procedure("0001", "SendBasic1", sendDSC, dependencies1);
		Procedure procedure2 = new Procedure("0002", "SendBasic2", sendDSC, dependencies1);
		Procedure procedure3 = new Procedure("0003", "SendBasic3", sendDSC, dependencies1);
		Procedure procedure4 = new Procedure("0004", "Encrypt1", encryptDSC, dependencies3);
		//Procedure procedure5 = new Procedure("0005", "Encrypt2", encryptDSC, dependencies2);
		//Procedure procedure6 = new Procedure("0006", "Encrypt3", encryptDSC, dependencies2);
		//Procedure procedure7 = new Procedure("0007", "Dummy1", dummyDSC);
		//Procedure procedure8 = new Procedure("0008", "Dummy2", dummyDSC, dependencies3);
		Procedure procedure9 = new Procedure("0009", "Compress1", compressDSC);
		//Procedure procedure0 = new Procedure("0010", "Compress2", compressDSC);
		//Procedure procedure11 = new Procedure("0011", "Additional1", additionalDSC);
		//Procedure procedure12 = new Procedure("0012", "Additional2", additionalDSC, dependencies4);
		//Procedure procedure13 = new Procedure("0013", "Additional3", additionalDSC, dependencies4);
		//Procedure procedure14 = new Procedure("0014", "Required1", requiredDSC);
		
		ProceduresRepository repo = ProceduresRepository.getInstance();
		repo.addProcedure(procedure1);
		repo.addProcedure(procedure2);
		repo.addProcedure(procedure3);
		repo.addProcedure(procedure4);
		//repo.addProcedure(procedure5);
		//repo.addProcedure(procedure6);
		//repo.addProcedure(procedure7);
		//repo.addProcedure(procedure8);
		repo.addProcedure(procedure9);
		//repo.addProcedure(procedure0);
		//repo.addProcedure(procedure11);
		//repo.addProcedure(procedure12);
		//repo.addProcedure(procedure13);
		//repo.addProcedure(procedure14);
		
		for (int i = 0; i < 90; i++){
			Procedure procedure = new Procedure(String.valueOf(i), "Compress2", new DSC("Test", Type.OPER));
			repo.addProcedure(procedure);
		}
		
		//Set up an initial DSC matching a command.
		DSC initialDSC = sendDSC;
		
		ArrayList<IntentModel> matchingModels = null;
		ArrayList<IntentModel> validModels = null;
		IntentModel bestModel = null;
		
		//Begin timing
		long startTime, endTime, duration = 0, totalTime = 0;
		int cycles = 1;
		for (int i = 0; i < cycles; i++){
			startTime = System.currentTimeMillis();

			// Find all models which match command
			matchingModels = (new NaiveGenerator()).generateModels(initialDSC);

			// Find valid models based on user preferences
			validModels = (new NaiveValidator()).validateModels(matchingModels, encryptDSC);

			// Find the best model based on cost
			bestModel = (new NaiveSelector()).getBestModel(validModels);

			//End timing
			endTime = System.currentTimeMillis();
			duration = endTime - startTime;
			totalTime = totalTime + duration;
		}

		System.out.println("Total time: \t" + totalTime);
		System.out.println("Average time: \t" + totalTime / cycles);
		
		
		// Format and print report
		System.out.println("We generated " + matchingModels.size() + " models");
		System.out.println();
		System.out.println(validModels.size() + " are valid based on user preferences");
		System.out.println();
		
		if (validModels.size() > 0)
			System.out.println("The best model is:\n" + bestModel.prettyPrinter());
		
		System.out.println("Total time for Model Generation: " + totalTime + " nanoseconds");
		
		
		System.out.println("\n\nThe full list of models:\n");
		for (int i = 0; i < matchingModels.size(); i++){
			System.out.println(matchingModels.get(i).prettyPrinter());
		}
		
		

	}
}