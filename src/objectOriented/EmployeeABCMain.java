package objectOriented;

public class EmployeeABCMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeABC emp1 = new EmployeeABC();
		
		emp1.firstName= "Shijo";
		emp1.lastName= " Joseph";
		emp1.hourlyRate = 20;
		
		
		System.out .println("name of the employee "+ emp1.firstName+emp1.lastName);
		System.out.println("hourlyrate  " + emp1.hourlyRate);
		
		System.out.println("Salary is "+ emp1.calculateSalary());
		
		
	}

}
