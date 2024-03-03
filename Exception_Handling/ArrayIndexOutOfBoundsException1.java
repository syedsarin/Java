package exception_handling;

public class ArrayIndexOutOfBoundsException1 {
	public void checkException() {
		try{
			int a[] = new int[50];
			a[6] = 20;
			System.out.println(a[6]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Out OF Bound Exception");
		}
	}
	
	//Main Mwthod.
	public static void main(String[] args) {
		ArrayIndexOutOfBoundsException1 a1 = new ArrayIndexOutOfBoundsException1();
		a1.checkException();
	}
}
