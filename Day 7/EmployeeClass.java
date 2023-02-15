/**
* Program to demonstrate use of Classes using constructor in Java
*/

class Employee{
	String name; 
	String designation; 
	String department;
	int age;
	
	Employee(String name, String designation, String department, int age){
		// this is a parameterized constructor of class Employee
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.age = age;
	}
	
	public void employeeDetails(){
		// Display the details of the Employee
		System.out.println("Employee Details : \n===================");
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		System.out.println("Designation : "+ designation);
		System.out.println("Department : "+ department);
	}
}

public class EmployeeClass{
	public static void main(String args[]){
		// create an object of Employee class
		Employee emp = new Employee("ABC DEf", "TECH ENGG", "XYZ", 25);
		emp.employeeDetails();
	}
}