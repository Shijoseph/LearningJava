package assignmentonEncapsulation;

public class Employee {
	
	 String firstName;
	 String lastName;
	 int sinNumber;
	 double salary;
	double monthlySalary;
 double biweeklySalary;
	
	
	Employee( String firstName,String lastName,int sinNumber)
	
	{ super();
		this.firstName = firstName;
	this.lastName = lastName;
	this.sinNumber = sinNumber;
}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getSinNumber() {
		return sinNumber;
	}


	public void setSinNumber(int sinNumber) {
		this.sinNumber = sinNumber;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		if(salary >0)
		{this.salary = salary;
	}else {System.out.println("value of salary should be > than zero");
	}
	}

	



	public double getBiweeklySalary() {
		return biweeklySalary;
	}


		
		
		
	
	
	void calculatepay()
	{monthlySalary = salary/12;
	}
	}

