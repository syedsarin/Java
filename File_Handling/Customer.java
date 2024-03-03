package Serialization_deSerialization;

import java.io.Serializable;
import java.util.Scanner;

public class Customer implements Serializable{
	private Integer customerId;
	private String customerName;
	private Double customerBill;
	
	public Customer(Integer customerId, String customerName, Double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}
	 
	public static Customer getCustomerObject()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Id :");
		Integer customerId = sc.nextInt();
		System.out.print("Customer Name :");
		String customerName = sc.nextLine();
		customerName = sc.nextLine();
		System.out.print("Enter Customer Bill :");
		Double customerBill = sc.nextDouble();
		Customer customer1 = new Customer(customerId, customerName, customerBill);
		return  customer1;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Double customerBill) {
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}