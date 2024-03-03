package exception_handling;

public class ExceptionDemo {
	public void checkException()
	{
		try {
			System.out.println("Try Block");
			int num1 = 5;
			int num2 = 0;
			@SuppressWarnings("unused")
			int op = num1/num2;
			
			
		}
		catch(ArithmeticException e) {
			System.err.println("Please Provide A Value Except 0. ");
		}
	}
	
	//Main Method
	public static void main(String[] args) {
		ExceptionDemo e1 = new ExceptionDemo();
		e1.checkException();
	
		
	}
}
