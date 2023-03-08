class Student1{
	
	String name;
	int rollno;
	
	Student1(String studentName, int roll){
		
		name = studentName;
		rollno = roll;
	}
	
	void display(){
		
		System.out.println("Student name: "+name+" Roll no: "+rollno);
	}
}

public class ParameterizedConstructorExample {

	public static void main(String[] args) {
		Student1 obj = new Student1("Ayan", 10);
		Student1 obj1 = new Student1("Saikat", 20);
		
		obj.display();
		obj1.display();
	}
}
