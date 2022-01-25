package org.emp;

public class Employee {
	private void empId() {
		// TODO Auto-generated method stub
System.out.println("Employee Id is : 1");
	}
	private void empName() {
		// TODO Auto-generated method stub
System.out.println("Employee Name is: Maragathish");
	}
	private void empDob() {
		// TODO Auto-generated method stub
System.out.println("Employee DOB is : 21-8-1992");
	}
	private void empPhone() {
		// TODO Auto-generated method stub
System.out.println("Employee Ph No: 7667343191");
	}
	private void empEmail() {
		// TODO Auto-generated method stub
System.out.println("Employee Email Id is : maragathish@gmail.com");
	}
	private void empAddress() {
		// TODO Auto-generated method stub
System.out.println("Employee Address is : Trichy");
	}
	public static void main(String[] args) {
		Employee e= new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
}
