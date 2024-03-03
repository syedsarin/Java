package Serialization_deSerialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class RetrieveCustomerObject {
	public static void main(String[] args) throws IOException, Exception {
		InputStream fin = new FileInputStream("C:\\Batch27\\Empdata.txt");
		var ois = new ObjectInputStream(fin);
		Customer cust=null;
		try(ois;fin){
		while((cust=(Customer)ois.readObject())!=null)
		{
			System.out.println(cust);
		}
		}
		catch(EOFException e)
		{
			System.err.println("End OF File Exception.");
		}
		System.out.println("End File Reached.");
	}
}
