package assignment22may2022;

public class MaxCapacityMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxCapacity =50;
		int customersInside=0;
	
		
		
		while (customersInside<50)
		{
		
		
		 int allowedCapacity = maxCapacity-customersInside;
		System.out.println("number of clients eligble to enter shop : "+ allowedCapacity);
		
	
		break;}
		if(customersInside>=maxCapacity)		
		{	
			System.out.println("max capacity reached");}
	}
}

