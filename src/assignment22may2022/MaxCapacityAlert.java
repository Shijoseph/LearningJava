package assignment22may2022;

public class MaxCapacityAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxCapacity =50;
		int customerCurrentlyShopping=50;
		
		int customergoingOut=10;
		int allowedCapacity=0;
		
		int currentCapcity = customerCurrentlyShopping-customergoingOut;
		
		
		while (currentCapcity<maxCapacity )
		{
		
			
		allowedCapacity = maxCapacity - currentCapcity;
		
		System.out.println("number of clients eligble to enter shop : "+ allowedCapacity);
		
	
		break;}
		
		
	
		
	if(currentCapcity>=maxCapacity)

	{

		System.out.println("max capacity 50 reached");

	}
}}
