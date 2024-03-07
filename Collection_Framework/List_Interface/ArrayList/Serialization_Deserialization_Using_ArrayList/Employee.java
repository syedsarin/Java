package exam_feb28;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Employee implements Serializable {
	Integer employeeId;
	String employeeName;
	Date dateOfJoining;

	public Employee(Integer employeeId, String employeeName, Date dateOfJoining) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfJoining = dateOfJoining;
	}
	
	public static Employee getEmployeeObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Id :");
		Integer employeeId = sc.nextInt();
		System.out.print("Enter Employee Name");
		String employeeName = sc.nextLine();
		employeeName = sc.nextLine();
		
		System.out.print("Enter Day Of Addmision :");
		int day=sc.nextInt();
		System.out.print("Enter Month of Addmission :");
		int month = sc.nextInt();
		System.out.print("Enter Year of Addmission :");
		int year = sc.nextInt();
		
		Date dateOfJoining = new Date(year, month, day);
		Employee e1 = new Employee(employeeId, employeeName, dateOfJoining);
		return e1;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfJoining="
				+ dateOfJoining + "]";
	}
	
	
}
