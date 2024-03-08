package march08;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Address_Book {
	public final static Scanner sc = new Scanner(System.in);

	public static void addPerson(HashMap<String, Long> hm) {
		try{
		System.out.print("Enter Person Name :");
		String studentName = sc.nextLine();
		 studentName = sc.nextLine();
		System.out.println("Enter Person Contact Number :");
		Long personContact = sc.nextLong();
		hm.put(studentName, personContact);
		}catch(InputMismatchException e)
		{
			System.err.println("Please Provide Valid Input.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		HashMap<String, Long> hm = new HashMap<>();
		while (true) {
			int choice = 0;
			System.out.println("*************************************Menu***************************************");
			System.out.println("Enter 1 To Add Name and Contact Number.");
			System.out.println("Enter 2 To Remove The Conatact.");
			System.out.println("Enter 3 To Exit");
			try{
			System.out.println("Enter Choice :");
			choice = sc.nextInt();
			}catch(InputMismatchException e)
			{
				System.err.println("Please Enter Valid Input.");
				System.exit(0);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			switch (choice) {
			case 1:
				addPerson(hm);
				break;
			case 2:
				if (hm.isEmpty()) {
					System.out.println("Addres Book Is Empty.");
				} else {
					try(sc){
					System.out.print("Enter Person Name to Remove :");
					String personName = sc.nextLine();
					 personName = sc.nextLine();
					 		
					if (hm.containsKey(personName)) {
						hm.remove(personName);
						System.out.println("Person Removed Succeffully.");
					} else {
						System.out.println("Person Not Found.");
					}
				} 
					catch(InputMismatchException e)
					{
						System.err.println("Please Enter Valid input.");
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				break;

			case 3: System.out.println("Best of Luck."); 
				System.out.println(hm);
				System.exit(0);
				

			}

		}
	}

}
