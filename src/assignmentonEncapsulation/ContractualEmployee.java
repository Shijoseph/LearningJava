package assignmentonEncapsulation;

public class ContractualEmployee extends Employee {
	
	double hours;

	ContractualEmployee(String firstName, String lastName, int sinNumber,int hours) {
		super(firstName, lastName, sinNumber);
		
		this.hours= hours;
		// TODO Auto-generated constructor stub
	}

	void calculatepay()
	{
		if( hours<=40)
		{
			biweeklySalary = salary*hours*2;
		}
		else {
			biweeklySalary =80*salary+( hours-40)*salary*3;
		}
		}
	}
	

