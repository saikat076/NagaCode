class Sample{
	
	String studentName;
	
	Sample(String studentName){
		//this keyword is used to refer to current class attributes/variables
		this.studentName = studentName;
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj = new Sample("Naga");
		System.out.println(obj.studentName);
	}
}
