package exception_handling;

public class IllegalStateException {
	
	 static void throwIllegalException() 
	{ 
		try
		{ 
			throw new ArithmeticException("MyException");
			}
		catch(ArithmeticException e)
		{
			System.out.println("caught:" +e); 
			}
		}
	 
	 //Main Method
	public static void main(String[] args) {
		throwIllegalException();
	}
}
