class Sample5{
	
	public int print(int x, int y) {
		
		return x+y;
	}
}

class Child3 extends Sample5{
	
	public double print(double x, double y, double z) {
		
		return x+y+z;
	}
}

public class ExampleMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample5 obj1 = new Sample5();
		System.out.println(obj1.print(10, 20));
		
		Child3 obj2 = new Child3();
		System.out.println(obj2.print(2.3, 6.5, 1.7));
	}

}
