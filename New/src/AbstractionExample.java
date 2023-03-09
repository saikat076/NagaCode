//Creating abstract class
abstract class SampleAbstraction{
	
	//Abstract method inside abstract class
	public abstract void printSomething();
	
	//Normal method inside abstract class
	public int sum(int a, int b) {
		
		return (a+b);
	}
}

//Creating child class of the abstract Class
class SampleAbstractionChild extends SampleAbstraction{
	
	//Implementing abstract method inside child
	public void printSomething() {
	
		System.out.println("Hello World");
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//As abstract class does have some method without body inside it, that is why we can create object of abstract class directly
		//SampleAbstraction obj1 = new SampleAbstraction();
		
		SampleAbstractionChild obj = new SampleAbstractionChild();
		System.out.println(obj.sum(6, 7));
		obj.printSomething();
	}
}
