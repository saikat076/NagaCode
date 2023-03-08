class Sample1{
	
	String studentName = "Naga";

	Sample1(String studentName){
		studentName = studentName+" "+this.studentName;
		System.out.println(studentName);
	}
}

public class ThisKeyword2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 obj = new Sample1("Saikat");
		
	}
}
