package exception_handling;

import java.util.Scanner;
public class SimpleExceptionDemo
{
 public static void main(String[] args)
 {
	 try {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter First Number: ");
		 int a = sc.nextInt();
		 System.out.print("Enter Secound Number: ");
		 int b = sc.nextInt();
		 sc.close();
		 
		 
	 }
	 catch(Exception e) {
		 System.err.println("Please Provide Integer Value");
		 
		 System.err.println(e.getMessage());
		 e.printStackTrace();
		System.out.println("To string "+  e.toString());
		
		 
	 }
	 
}
}
