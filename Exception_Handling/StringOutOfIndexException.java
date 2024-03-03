package exception_handling;

public class StringOutOfIndexException {
	public void checkException()
	{ 
	 try
	 {
	String Str = "Hello World";
	
	System.out.println("String Lenght: "+Str.length());
	
	char c=Str.charAt(0);
	c=Str.charAt(40);
	System.out.println(c);
	}
	catch(StringIndexOutOfBoundsException s)
	{ 
	System.out.println("String Index Out Of Bounds Exception !");
	}
	}
	
	//Main Method
	public static void main(String[] args) {
		StringOutOfIndexException s = new StringOutOfIndexException();
		s.checkException();
	}

}
