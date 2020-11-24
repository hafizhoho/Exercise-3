package Polymorphism;


public class ProtonX70 extends Proton{
	
	String park, model;
	private String radio;
	private String key = "keyless remote";
	
	ProtonX70() {
		this.model = "Proton X70";
		this.park = "Auto park available";
	}
	
	public void setRadio(String myradio) {
		this.radio = myradio;
	}
	
	public String getRadio() {
		return radio;
	}
	
	public void setKey(String myKey) {
		this.key = myKey;
	}
	
	public String getKey() { 
		return key;
	}
	
	class x70Speed extends Vehicle{ 
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
	
	class x70Varian extends Varian{ 

		public void display() {
			System.out.println("Varian : " + flag);
		}
	}

	
	public void VoiceControl() {
		System.out.println("Model : " + model);
		System.out.println("Voice Control");
		x70Speed S = new x70Speed(); 
		x70Varian V = new x70Varian(); 
		S.display();
		S.sing();
		V.display();
	}
	
}