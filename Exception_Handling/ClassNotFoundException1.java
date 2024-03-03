package exception_handling;

public class ClassNotFoundException1 {
	
	@SuppressWarnings("unused")
	public ClassNotFoundException1() {
		@SuppressWarnings("rawtypes")
		Class c;
		try {
			//System.out.println("Hiiii");
			c = Class.forName("SimpleExceptionDemo");
			
		} 
		catch (ClassNotFoundException e)
		{
		System.err.println("Class Not Found.");
		e.printStackTrace();
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		}
		
		//Main Method
		public static void main(String[] args) {
		@SuppressWarnings("unused")
		ClassNotFoundException1 a = new ClassNotFoundException1();
		
	}
	
	}



