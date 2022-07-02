package encapsulation;

public class Employee {

	private int sinNumber;
	private double salary;
	//int level;
	//boolean ifauthorised;

//get salary

	public double getSalary() {
		return salary;
	}

	// set salary

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	//constructor
	public Employee(int sinNumber,double salary) {
		this.sinNumber = sinNumber;
		this.salary=salary;
		//this.level= level;
	//	this.ifauthorised=ifauthorised;
	}

	//get sinnumber
	public int getSinNumber() {
		return sinNumber;
	
	}
	
	//set sinnumber

	public void setsinNumber(int sinNumber,  int pinnumber,CRA cra) {
		if ( cra.checkifauthorised() && pinnumber == 777) {
			this.sinNumber = sinNumber;
		} else {
			System.out.println("unauthorised access");
		}
	}}

