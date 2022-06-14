package objectOriented;

public class EmployeeMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//instantiate an object
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();	
		
		//assigning values to the object
		
		//for employee 1
		emp1.employeeName = "John";
		emp1.employeeID = "HP01234";
		emp1.department = "HR";
		emp1.backgroundCheck ="y";
		emp1.annaulSalary = 55000;
		emp1.performanceScore = 88;
		emp1.yearOfJoining = 2020;
		emp1.ceritificationCompleted="y";
		emp1.staffLoanAmount=12000;
		
		
		//for  employee 2
		emp2.employeeName = "Rahul";
		emp2.employeeID ="HP01222";
		emp2.department ="IT";
		emp2.backgroundCheck ="n";
		emp2.annaulSalary=70000;
		emp2.performanceScore = 77;
		emp2.yearOfJoining =2010;
		emp2.ceritificationCompleted= "y";
		emp2.staffLoanAmount = 35000;
		
		
		// for employee 3
		emp3.employeeName = "David";
		emp3.employeeID ="HP22";
		emp3.department = "FINANCE";
		emp3.backgroundCheck = "y";
		emp3.annaulSalary = 90000;
		emp3.performanceScore = 90;
		emp3.yearOfJoining = 2000;
		emp3.ceritificationCompleted ="n";
		emp3.staffLoanAmount = 55000;
		
		
		
		//invoking the methods
		
		
		emp1.increment();
		emp1.elearning();
		emp1.staffloan();
		emp1.vacation();
		
		
		emp2.increment();
		emp2.elearning();
		emp2.staffloan();
		emp2.vacation();
	
		emp3.increment();
		emp3.elearning();
		emp3.staffloan();
		emp3.vacation();
	}

}
