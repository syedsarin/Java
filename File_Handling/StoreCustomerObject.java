package Serialization_deSerialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoreCustomerObject {
public static void main(String[] args) throws Exception {
	var sc = new Scanner(System.in);
	var fout = new FileOutputStream("C:\\Batch27\\Empdata.txt");
	var oos = new ObjectOutputStream(fout);
	
	try(sc; fout; oos)
	{
		System.out.print("Enter How many Customer object you want create :");
		int num = sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		Customer customerObject = Customer.getCustomerObject();
		oos.writeObject(customerObject);
	}
	
	}
	catch(InputMismatchException e) {
		System.err.println("Input Miss MAtch Exception.");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("File Succeffullly Created.");
}

}
