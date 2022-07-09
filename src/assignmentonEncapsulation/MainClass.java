package assignmentonEncapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		double high =0,low=0;
		
		PermanentEmployee obj1 = new PermanentEmployee( "rahul","kumar",12345);
		obj1.setSalary(50000);
		PermanentEmployee obj2 = new PermanentEmployee("david","dane",74122);
		obj2.setSalary(40000);
		PermanentEmployee obj3 = new PermanentEmployee("syam","mohan",98745);
		obj3.setSalary(55000);
		
		ContractualEmployee obj4 = new ContractualEmployee("john","dayne",12345,55);
		obj4.setSalary(15);
		ContractualEmployee obj5 = new ContractualEmployee("dev","singh",12555,45);
		obj5.setSalary(25);
		ContractualEmployee obj6 = new ContractualEmployee("rohan","sharma",18555,40);
		obj6.setSalary(12);
		
		CommissionEmployees obj7 = new CommissionEmployees ("ryan", "saunders", 98563, 25000);
		obj7.setSalary(50000);
		CommissionEmployees obj8 = new CommissionEmployees ("ron", "derek", 97452, 15000);
		obj8.setSalary(20000);
		CommissionEmployees obj9 = new CommissionEmployees ("peter", "marshall", 52863, 35000);
		obj9.setSalary(10000);
		
		Employee []employee = {obj1,obj2,obj3,obj4,obj5,obj6,obj7,obj8,obj9};
		
		
		for(int i = 0; i<employee.length;i++)
		{ 
			employee[i].calculatepay();
			high = employee[0].getBiweeklySalary();
			low = employee[0].getBiweeklySalary();
			for (int j = 0; j < employee.length; j++) {
//				System.out.println(employees[i].biweeklySalary);
				if (high < employee[j].getBiweeklySalary()) {
					high= employee[j].getBiweeklySalary();
					a = j;
				}
				if (low > employee[j].getBiweeklySalary()) {
					low = employee[j].getBiweeklySalary();
					b = j;
				}
			
		}
		}	
		
		System.out.println("Highest Salary : " + high);
		System.out.println("Name of the employee with highest salary : " + employee[a].getFirstName() + " "
				+ employee[a].getLastName());
		System.out.println("Lowest Salary : " + low);
		System.out.println("Name of the employee with lowest salary : " + employee[b].getFirstName() + " "
				+ employee[b].getLastName());
		
	
	}


}
