//Writing Interface
interface SampleInterface{
	
	//Declaring method inside interface but not defining method body
	void printSomething();
}

//Writing Class that implement the interface
class InterfaceImplementationClass implements SampleInterface{

	//Declaring the method body that's defined inside the interface
	public void printSomething() {
		
		System.out.println("Hello World!");
	}	
}

class InterfaceImplementationClass1 implements SampleInterface{

	public void printSomething() {
		// TODO Auto-generated method stub
		System.out.println("Hello Naga!");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementationClass1 obj = new InterfaceImplementationClass1();
		obj.printSomething();
	}
}
