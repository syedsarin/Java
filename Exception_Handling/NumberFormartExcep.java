package exception_handling;

public class NumberFormartExcep {
	public void checexception() {
		try
		{
			System.out.println("Try Block Executed");
			@SuppressWarnings("unused")
			int num = Integer.parseInt("abs"); 
		}
		catch(NumberFormatException e) {
			System.err.println("Number Format Exception.");
			//System.out.println(e);
			System.out.println("Catch Block Executed.");
		}
	}
	
	//Main Method
	public static void main(String[] args) {
		NumberFormartExcep e = new NumberFormartExcep();
		e.checexception();
		System.out.println("Main Method Executed");
	}
}
