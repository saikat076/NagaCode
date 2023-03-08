class Sample3{
	
	String studentName;
	int rollno;
	
	void setName(String studentName) {
		
		this.studentName = studentName;
	}
	
	void setRoll(int rollno) {
		
		this.rollno = rollno;
	}
	
	String getName() {
		
		return this.studentName;
	}
	
	int getRoll(){
		
		return this.rollno;
	}
}

public class GetterSetterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 obj = new Sample3();
		
		obj.setName("Naga");
		obj.setRoll(1);
		
		System.out.println(obj.getName());
		System.out.println(obj.getRoll());
	}
}
