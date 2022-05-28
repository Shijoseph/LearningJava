package assignment22may2022;

public class MaxNumberofCustomers {

	public static void main(String[] args){ {
		// TODO Auto-generated method stub
		int maxCapacity = 50;
		int customerCurrentlyShopping = 0;
		int customerGoingOut = 0;
		int customerComingIn = 10;
		int currentCapacity = 0;
		currentCapacity = customerCurrentlyShopping - customerGoingOut;
		currentCapacity = currentCapacity + customerComingIn;

		while (currentCapacity < maxCapacity) {
			int allowedCapacity = maxCapacity - currentCapacity;

			System.out.println("customer currently entering the shop " + customerComingIn);
			System.out.println("customer currently exiting the shop " + customerGoingOut);
			System.out.println("customer eligible to enter the shop " + allowedCapacity);
			
			break;}
		

		if (currentCapacity == maxCapacity || customerCurrentlyShopping == maxCapacity)
		{
			System.out.println("maximum capacity reached");
		}
		 if (currentCapacity > maxCapacity) {
			int allowedNumber = currentCapacity - maxCapacity;
			allowedNumber = customerComingIn - allowedNumber;
			System.out.println("out of " + customerComingIn + "  waiting to enter   ");
			System.out.println("only   " + allowedNumber + "  can enter");
			
		}
		 
	}
	}}

