class Student{
	
	int id;
	String name;
	
	void setId(int id) {
		
		this.id = id;
	}
	
	void setName(String name) {
		
		this.name = name;
	}
	
	int getId() {
		
		return this.id;
	}
	
	String getName() {
		
		return this.name;
	}
}

public class GetterSetterWithArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] obj = new Student[3];
		
		obj[0] = new Student();
		obj[0].setId(1);
		obj[0].setName("Naga");
		
		obj[1] = new Student();
		obj[1].setId(2);
		obj[1].setName("Saikat");
		
		obj[2] = new Student();
		obj[2].setId(3);
		obj[2].setName("Rajni");
		
		System.out.println(obj[2].getId());
		System.out.println(obj[2].getName());
	}
}
