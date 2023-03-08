class InvalidAgeException extends Exception{
	
	public InvalidAgeException(String str) {
	
		super(str);
	}
}

public class CustomExceptionExample {

	public void checkAge(int age) throws InvalidAgeException {
	
		if(age<0) {
			throw new InvalidAgeException("Age cannot be less than zero");
		}
	}
	
	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		CustomExceptionExample obj = new CustomExceptionExample();
		obj.checkAge(-20);
	}

}
