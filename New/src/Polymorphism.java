//Method Overloading
class Animal1{
	
	public void numberOfLegs() {
		
		System.out.println("Animal has legs");
	}
}

class Lion1 extends Animal{
	
	public void numberOfLegs() {
		
		System.out.println("Lion has 4 legs");
	}
}

class Crow extends Animal{
	
	public void numberOfLegs() {
		
		System.out.println("Crow has 2 legs");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal1 obj = new Animal1();
		obj.numberOfLegs();
		
		Lion1 obj1 = new Lion1();
		obj1.numberOfLegs();
		
		Crow obj2 = new Crow();
		obj2.numberOfLegs();
	}
}
