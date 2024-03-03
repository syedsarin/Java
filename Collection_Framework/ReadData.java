package exam_feb28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("E://Array//Employee.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try (fis;ois){
		ArrayList<Employee> s1;
		while((s1 = (ArrayList<Employee>) ois.readObject())!=null)
		{
			Iterator< Employee> i1 = s1.iterator() ;
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
		}
		} catch(FileNotFoundException e)
		{
			System.err.println("File Not Found.");
		}
		catch(Exception e) {
			System.out.println("Dara Read Successfully.");
		}
	}
}
