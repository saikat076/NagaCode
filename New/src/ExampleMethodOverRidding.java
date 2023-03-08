class Sample100{
	
	public int rslt(int x, int y) {
		
		return x+y;
	}
}

class Child extends Sample100{
	
	public int rslt(int x, int y) {
		
		return x*y;
	}
}

public class ExampleMethodOverRidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		float ans = obj.rslt(10, 20);
		System.out.println(ans);
	}
}
