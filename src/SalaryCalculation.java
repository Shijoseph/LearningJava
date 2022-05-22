
public class SalaryCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to calculate the weekly salary
		
				int hourlyrate = 14;
				
				int weeklysalary = 0;
				double takehomeweeklysalary = 0;
				
				
				weeklysalary = hourlyrate*8*5;
				takehomeweeklysalary = 0.90*weeklysalary;
				
				System.out.println("Weekly Salary is "+weeklysalary);
				System.out.println("take home salary after tax deduction is "+takehomeweeklysalary);
				
			

	}

}
