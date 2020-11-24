package Polymorphism;

public class MainProton {
	
	

	public static void main(String[] args) {
	
		
		ProtonSaga PS = new ProtonSaga();
		ProtonPersona PP = new ProtonPersona();
		ProtonX50 X50 = new ProtonX50();
		ProtonX70 X70 = new ProtonX70();
		
		System.out.println("Proton Car Model 2020\n");
		
		
		PS.fuelSave();
		PS.printProton();
		PS.setRadio("Pioneer");
		System.out.println("Type of key: " + PS.getKey());
		System.out.println("Radio brand: " + PS.getRadio());
		System.out.println("\n");
		
		
		PP.bigSpace();
		PP.printProton();
		PP.setRadio("Kenwood");
		System.out.println("Type of key: " + PP.getKey());
		System.out.println("Radio brand: " + PP.getRadio());
		System.out.println("\n");
		
	
		X50.selfPark();
		X50.printProton();
		X50.setRadio("Alpine");
		System.out.println("Type of key: " + X50.getKey());
		System.out.println("Radio brand: " + X50.getRadio());
		System.out.println("\n");
		
	
		X70.VoiceControl();
		X70.printProton();
		X70.setRadio("Alpine");
		System.out.println("Type of key: " + X70.getKey());
		System.out.println("Radio brand: " + X70.getRadio());
	}

}
