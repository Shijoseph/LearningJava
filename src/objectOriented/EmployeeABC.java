package objectOriented;

import java.util.Scanner;

public class EmployeeABC {
	



	
	
	
	
	String firstName;
	String lastName;
	double hourlyRate;
	double salaryForTheWeek;
	double noOfHours;
	Scanner sc = new Scanner(System.in);
	
	double calculateSalary()
	{
	
	{System.out.println("enter the number of hours worked in the week");
	noOfHours= sc.nextDouble();
	salaryForTheWeek=noOfHours*hourlyRate;
	return salaryForTheWeek;
	}
	
	
	}
}


