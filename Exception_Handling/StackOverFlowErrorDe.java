package exception_handling;

public class StackOverFlowErrorDe {
	public void display()
	{
		try {
	System.out.println(" I am StackOverFlow");
	display();
	}
		catch(StackOverflowError e ) {
			System.err.println("Stack Over Flow");
		}
	}
	
	//Main Method
	public static void main(String[] args) {
		StackOverFlowErrorDe d = new StackOverFlowErrorDe();
		d.display();
	}

}
