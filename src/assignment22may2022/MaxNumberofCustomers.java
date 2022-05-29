package assignment22may2022;



public class MaxNumberofCustomers {

	public static void main(String[] args){ {
		// TODO Auto-generated method stub
		int maxCapacity = 50;
		int customerCurrentlyShopping = 50;
		int customerGoingOut = 50;
		int customerComingIn = 5;
		int currentCapacity = 0;
		currentCapacity = customerCurrentlyShopping - customerGoingOut;
		currentCapacity = currentCapacity + customerComingIn;
		int allowedCapacity;
		
		
		{
			while (currentCapacity < maxCapacity && customerComingIn != 0) 
			{
			 allowedCapacity = maxCapacity - currentCapacity;
			
			
			
			if(currentCapacity < maxCapacity)
			{
			System.out.println("customer currently entering the shop " + customerComingIn);
			System.out.println("customer currently exiting the shop " + customerGoingOut);
			System.out.println("customer eligible to enter the shop " + allowedCapacity);
			
			System.out.println("                                      ");
			
		
			
			currentCapacity += customerComingIn;
		}
			
		
		}
		if (currentCapacity == maxCapacity || customerCurrentlyShopping == maxCapacity)
		{
			System.out.println("maximum capacity reached");
			
		}
		 if (currentCapacity > maxCapacity) {
			int allowedNumber = currentCapacity - maxCapacity;
			allowedNumber = customerComingIn - allowedNumber;
			System.out.println("out of " + customerComingIn + "  waiting to enter   ");
			System.out.println("only   " + allowedNumber + "  can enter");
			
		}}
		if(currentCapacity ==0 && customerComingIn ==0 ) 
		{System.out.println("shop is empty, 50 people can enter  the shop");
		
		}
		
		if(currentCapacity >0 && customerComingIn ==0 ) 
			
		{ allowedCapacity = maxCapacity - currentCapacity;
			System.out.println(allowedCapacity + "  can enter the shop" );
		
		}
		 
	}
	
	}}