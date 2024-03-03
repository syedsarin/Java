package exception_handling;

public class ArrayOutOfBoundException {
	public static void main(String[] args) {
		try {
		int a[] = new int[2];
		System.out.println(a[3]);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			System.err.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			System.err.println("Array out Of Bound Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}
