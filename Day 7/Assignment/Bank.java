/**
* A bank program using classes
*/
//BANK
//CUSTName,age,acctype,ban
//display cust

class Customer{
	String customer_name; 
	String account_type; 
	double balance;
	int age;
	
	Customer(String name, String acnt_type, int age, double balance){
		// this is a parameterized constructor of class Employee
		this.customer_name = name;
		this.account_type = acnt_type;
		this.balance = balance;
		this.age = age;
	}
	
	public void customerDetails(){
		// Display the details of the Employee
		System.out.println("Employee Details : \n===================");
		System.out.println("Name : "+ customer_name);
		System.out.println("Age : "+ age);
		System.out.println("Account Type : "+ account_type);
		System.out.println("Balance : $ "+ balance);
	}
}

public class Bank{
	public static void main(String args[]){
		// create an object of Employee class
		Customer cust = new Customer("ABC DEf", "Salary", 32, 25000000.00);
		cust.customerDetails();
	}
}