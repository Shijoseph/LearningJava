package assignmentonEncapsulation;

public class CommissionEmployees extends Employee {

	int sales;

	CommissionEmployees(String firstName, String lastName, int sinNumber, int sales) {
		super(firstName, lastName, sinNumber);

		this.sales = sales;
		// TODO Auto-generated constructor stub
	}

void calculatepay()
{
	biweeklySalary = salary/24 + sales*0.15;

}
}