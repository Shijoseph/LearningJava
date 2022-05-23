package assignment22may2022;

public class MaxCapacityAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxCapacity =50;
		int customerCurrentlyShopping=40;
	 
		int customergoingOut=40;
		int customerComingIn =50;
		int currentCapcity = customerCurrentlyShopping-customergoingOut+customerComingIn;
		int allowedCapacity=0;
		
		while (currentCapcity<maxCapacity )
			
		{allowedCapacity = maxCapacity - currentCapcity;
		
		System.out.println("number of clients eligble to enter shop : "+ allowedCapacity);
		
	
		break;}
		
		
		
		
		if(currentCapcity>=maxCapacity)
		
		
			System.out.println("max capacity 50 reached");
			
		}
}

