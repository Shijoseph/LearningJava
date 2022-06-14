package objectOriented;

public class Employee {
//attribute
	String employeeName;
	String employeeID;
	double annaulSalary;
	int yearOfJoining;
	String backgroundCheck;
	double performanceScore;
	String department;
	String ceritificationCompleted;
	double staffLoanAmount;

	// creating methods

	void increment() {
		System .out.println(" ***DETAILS OF THE EMPLOYEE ***");
		System.out.println("name of the employee  " + employeeName);
		System.out.println("employee ID for " + employeeName + " =  " + employeeID);
		System.out.println(employeeName + " works in " + department+ " department");
		System.out.println("year of joining  " + yearOfJoining);

		if (backgroundCheck.equals("y") && performanceScore >= 85) {

			System.out.println("eligible for annual increment");
			System.out.println(" annual increment is =  " + (annaulSalary * 8.5) / 100);

		} else if (backgroundCheck.equals("y") && (performanceScore < 85)) {

			System.out.println("eligbile for basic increment");
			System.out.println("basic increment is  = " + (annaulSalary * 5) / 100);
		} else {

			System.out.println("not eligible for increment");
		}
	}

	void elearning() {
		if (department.equals("HR")) {
			System.out.println(employeeName+ " should complete all the modules of HRM from 1 to 20 within 3 months");

		} else if (department.equals("FINANCE")) {
			System.out.println(employeeName+ "  should complete all the modules of FM from 1 to 10 within 3 months");

		} else if (department.equals("IT")) {
			System.out.println(employeeName + " should  all the modules of IT from 1 to 30 within 3 months");

		}
	}

	void staffloan()

	{
		if (staffLoanAmount < 15000) {
			for (int i = 1; i <= 3; i++)

			{
				staffLoanAmount = staffLoanAmount + (staffLoanAmount * .02);
				System.out.println("loan amount at the end of " + i + " year  = " + Math.round(staffLoanAmount));

			}
		}

		
			if (staffLoanAmount >= 15000 && staffLoanAmount <= 40000) {
				for (int i = 1; i <= 3; i++)

				{
					staffLoanAmount = staffLoanAmount + (staffLoanAmount * .04);
					System.out.println("loan amount at the end of " + i + " year  = " + Math.round(staffLoanAmount));

				}
			}

			{
				if (staffLoanAmount > 40000 && staffLoanAmount <= 60000) {
					for (int i = 1; i <= 3; i++)

					{
						staffLoanAmount = staffLoanAmount + (staffLoanAmount * .06);
						System.out
								.println("loan amount at the end of " + i + " year  = " + Math.round(staffLoanAmount));

					}
				}
			}
		
	}

	void vacation() {
		if (ceritificationCompleted.equals("y") && performanceScore > 85) {
			System.out.println(employeeName + "  is eligible for 15 days vacation in the current year ");
			System.out.println();
			System.out.println();
		}

		else if (ceritificationCompleted.equals("y") && performanceScore < 85) {
			System.out.println(employeeName + " is eligible for 10 days of vacation in the curret year");
			System.out.println();
			System.out.println();
		} else {
			System.out.println("kindly complete the certification");
			System.out.println();
			System.out.println();
		}
	}

}
