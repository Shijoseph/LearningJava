package assignment22may2022;
import java.util.Scanner;

public class CovidRestrictionApp {

	public static void main(String[] args) {
		
	
				// TODO Auto-generated method stub
				int maxCapacity = 50;
				int customerCurrentlyShopping = 0;// used as dynamic datatype
				int customerGoingOut = 0; // used as dynamic datatype
				int customerComingIn = 0;  // used as dynamic datatype
				int currentCapacity = 0;  // used as dynamic datatype
				
				Scanner sc = new Scanner(System.in);// use scanner class to initialize the value entered in console
				System.out.println("enter value for customer currently shopping");
				
				customerCurrentlyShopping = sc.nextInt();
				
				System.out.println("enter value for customers going out");
				
				customerGoingOut = sc.nextInt();
				
				System.out.println("enter value for customers coming in");
				
				customerComingIn = sc.nextInt();
				
				currentCapacity = customerCurrentlyShopping - customerGoingOut;
				currentCapacity = currentCapacity + customerComingIn;
				int allowedCapacity;
				
				
				{
					while (currentCapacity < maxCapacity && customerComingIn != 0) // customerCOmingIn!= 0 is used else the loop will not end as 
						// no new customers are entering
					{
						
					 allowedCapacity = maxCapacity - currentCapacity;
					
					
					
					if(currentCapacity < maxCapacity  )
					{
					System.out.println("customer currently entering the shop " + customerComingIn);
					System.out.println("customer currently exiting the shop " + customerGoingOut);
					System.out.println("customer eligible to enter the shop " + allowedCapacity);
					
					System.out.println("                                      ");
					
				
					
					currentCapacity += customerComingIn;// if line 51 is not used the loop will not end as the value remains same
				}
					
				
				}
				if (currentCapacity == maxCapacity || customerCurrentlyShopping == maxCapacity)
				{
					System.out.println("maximum capacity reached");
					
				}
				 if (currentCapacity > maxCapacity) {
					int allowedNumber = currentCapacity - maxCapacity;
					allowedNumber = customerComingIn - allowedNumber;
					System.out.println("out of " + customerComingIn + "  waiting to enter   ");// when the total value of current capacity is greater than  
					//maxcapacity it will show how many customers out of the waiting customers can enter
					System.out.println("only   " + allowedNumber + "  can enter");
					
				}}
				if(currentCapacity ==0 && customerComingIn ==0 ) 
				{System.out.println("shop is empty, 50 people can enter  the shop");//when the shop is completely empty
				
				}
				
				if(currentCapacity >0 && customerComingIn ==0 ) 
					
				{ allowedCapacity = maxCapacity - currentCapacity;
					System.out.println(allowedCapacity + "  can enter the shop" );
				
				}
				
			}
}

	

