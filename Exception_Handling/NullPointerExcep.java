package exception_handling;

public class NullPointerExcep {
	@SuppressWarnings("null")
	public void checkException() {
		try {
			System.out.println("Try Started");
			String str = null;
			System.out.println(str.length());
			
		} catch (NullPointerException e) {
			
			System.err.println("Null Pointer Exception");
		}
	}
	
	//Main Method
	public static void main(String[] args) {
		NullPointerExcep n = new NullPointerExcep();
		n.checkException();
	}
}
