package Polymorphism;

public class ProtonX50 extends Proton{
	
	String park, model;
	private String radio;
	private String key = "keyless remote";
	
	ProtonX50() {
		this.model = "Proton X50";
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
	
	class x50Speed extends Vehicle{ 
		int maxSpeed = 180;
		int lowSpeed = 130;
		int limitSpeed = 130;

		public void display() { 
			System.out.println("Max speed : " + maxSpeed + "km/h");
		}
		
		public void  sing(String sing) { 
			System.out.println("Broom Brooom");
		}
	}
	
	class x50Varian extends Varian{ 

		public void display() {
			System.out.println("Varian : " + high);
		}
	}

	
	public void selfPark() {
		System.out.println("Model : " + model);
		System.out.println("Auto parking assist : " + park);
		x50Speed S = new x50Speed(); 
		x50Varian V = new x50Varian(); 
		S.display();
		S.sing();
		V.display();
	}
	
}
