package objectOriented;

import java.util.Scanner;

public class EmployeeABCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		boolean ifneedtocheck = false;
		
	
		EmployeeABC emp = new EmployeeABC();
		do {
			
			System.out.println("enter the first name");
			emp.firstName = sc.next();
			System.out.println("enter the last name");
			emp.lastName = sc.next();
			System.out.println("enter the hourly rate");
			emp.hourlyRate =sc.nextInt();
			
		System.out.println("enter the  number of hours worked");
		int noOfHoursWorked = sc.nextInt();
		
		int Salary =  emp.calculateSalary(noOfHoursWorked);
		
		System.out.println( "first name  "+emp.firstName);
		System.out.println("last name  "+ emp.lastName);
		System.out.println("hourly rate   "+ emp.hourlyRate);
		System.out.println(" number of hours worked  "+noOfHoursWorked);
		System.out.println("weekly salary  "+Salary);
	
		
		System.out.println("do you want to check other employee salary enter true/false");
		ifneedtocheck= sc.nextBoolean();
		
			}
		
		
		while (ifneedtocheck);
		{sc.close();
		}
		}

	

}

