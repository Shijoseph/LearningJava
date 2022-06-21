package objectOriented;

import java.util.Scanner;

public class EmployeeABC {

	String firstName;
	String lastName;
	int hourlyRate;
    int salaryForTheWeek;
	//double noOfHours;
//	Scanner sc = new Scanner(System.in);

	int calculateSalary( int noOfHours ) {

		{
			//System.out.println("enter the number of hours worked in the week");
			//noOfHours = sc.nextDouble();
			salaryForTheWeek = noOfHours * hourlyRate;
			return salaryForTheWeek;
		}

	}
}
