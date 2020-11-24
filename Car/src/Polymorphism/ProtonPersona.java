package Polymorphism;

public class ProtonPersona extends Proton{
	
	String model;
	private String radio;
	private String key="remote";
	
	ProtonPersona(){
		this.model = "Proton Persona";
	}
	
	public void setRadio(String newRadio) {
		radio = newRadio;
	}
	
	public String getRadio() {
		return radio;
	}
	
	public void setKey(String newKey) {
		key = newKey;
	}
	
	public String getKey() {
		return key;
	}
	
	class PersonaSpeed extends Vehicle{ 
		int maxSpeed = 180;
		int lowSpeed = 80;
		int limitSpeed = 130;

		public void display() { 
			System.out.println("Max speed : " + super.maxSpeed + "km/h");
		}
		
		public void  sing(String sing) {  
			System.out.println("Broom Brooom");
		}
	}
	
	class PersonaVarian extends Varian{ 

		public void display() {
			System.out.println("Varian : " + medium);
		}
	}
	
	
	
	public void bigSpace() {
		System.out.println("Model : " + model);
		System.out.println("Big Space");
		PersonaSpeed S = new PersonaSpeed(); 
		PersonaVarian V = new PersonaVarian(); 
		S.display();
		V.display();
		S.sing();
	}
	


	
}
