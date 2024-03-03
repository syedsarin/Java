package Serialization_deSerialization;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteIntoMultipleFiles {
	public static void main(String[] args) throws Exception{
		String str="Java Is awesome";
		byte b[]=str.getBytes();
		var f1 = new FileOutputStream("C:\\Batch27\\data.txt");
		var f2 = new FileOutputStream ("C:\\Batch27\\data2.txt");
		var f3 = new FileOutputStream("C:\\Batch27\\data3.txt");
		
		var bout = new ByteArrayOutputStream();
		
		bout.writeBytes(b);
		bout.writeTo(f1);
		bout.writeTo(f2);
		bout.writeTo(f3);
		bout.flush();
		
	}
}
