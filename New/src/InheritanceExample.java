//Parent class
class Parent{
	
	//Method from Parent Class
	int i=10;
	public void printParent() {
		
		System.out.println("I am parent class");
	}
}

//Creating child from Parent class and child will be having all the methods and variables which is present inside parent class
class Child1 extends Parent{
	
	public void printChild() {
		
		System.out.println("I am child class");
	}
}

class Child2 extends Parent{
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 obj = new Child2();
		obj.printParent();
		System.out.println(obj.i);
	}
}
