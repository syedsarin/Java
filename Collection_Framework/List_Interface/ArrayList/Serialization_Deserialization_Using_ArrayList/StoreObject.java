package exam_feb28;

import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);	
		ArrayList<Employee> al = new ArrayList<Employee>();
		FileOutputStream fos = new FileOutputStream("E://Array//Employee.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try(sc;fos;oos){
		System.out.print("How Many Object Yopu Want To Create :");
		int obj = sc.nextInt();
		
		for(int i=1;i<=obj;i++)
		{
			
			Employee object = Employee.getEmployeeObject();
			al.add(object);
		}
		oos.writeObject(al);
		}
		catch(EOFException e)
		{
			System.err.println(e);
		}
		System.out.println("File Created Successfully");
	}
}
