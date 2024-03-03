package exception_handling;

public class HandleNullPointerException {
	public void display(int  num) {
		System.out.println("num"+num);
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		HandleNullPointerException h = null;
		if(h==null) {
			h = new HandleNullPointerException();
			h.display(11);
		}
		else {
			h.display(11);
		}
		
		//Or
//		try {
//			h.display(22);
//		}
//		catch(NullPointerException e)
//		{
//			System.err.println("Null Pointer Exception.");
//		}
	}
	
}
