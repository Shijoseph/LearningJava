package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRA obj1 = new CRA (5,"John");
		CRA obj2 = new CRA (7,"David");
		Employee employee = new Employee(123456789,3500.75);
		
	
		
		
		System.out.println("sin number  "+ employee.getSinNumber());
		
	

		employee.setsinNumber(123456, 777,obj1);
		
		System.out.println("sin number  "+ employee.getSinNumber());
		System.out.println();
		employee.setsinNumber(123456, 777,obj2);
		System.out.println("sin number changed to  "+ employee.getSinNumber());
	}

}
