class Animal{
	
	public void numberOfLegs() {
		
		System.out.println("Animal has legs");
	}
}

class Lion extends Animal {
	
	Lion(){
		
		System.out.println("Constructor called!");
		super.numberOfLegs();
	}
	
	public void numberOfLegs() {
		
		super.numberOfLegs();
		System.out.println("Lion has 4 legs");
	}
}

public class SuperClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lion obj = new Lion();
		obj.numberOfLegs();
	}
}
