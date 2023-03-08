import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();

		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();

		int num3=0;

		try {
			num3 = num1/num2;
			System.out.println("The result is: "+num3);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}finally {
			System.out.println("Bye!");
		}
		
	}
}
