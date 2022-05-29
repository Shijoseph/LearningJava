package assignment22may2022;

import java.util.Scanner;

public class PromDiscountCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//initialize variable with the three types of promo code with string datatype
		
		String availablePromoCode1 = "Promo5";
		String availablePromoCode2 = "Promo10";
		String availablePromoCode3 = "Promo20";
		
		String enteredPromoCode = "";// to define a dynamic datatype for entered promo code
		
		
		System.out.println("enter the promocode");
				
		Scanner sc = new Scanner(System.in);// using scanner class to get the value of entered in the console for enteredPromocde & totalCostPrice

		enteredPromoCode = sc.next();// the value entered by the user in the console is stored
		
		System.out.println("enter the total Cost Price");

		// initialize variable  with datatype double
		double totalCostPrice =0.00;
		totalCostPrice =sc.nextDouble();// value entered by user for total cost price in  the console is stored
		double grossDiscountPrice = .50*totalCostPrice;
	
		
		//// use if  else to check for the three different conditions  and print the value accordingly
		if( enteredPromoCode.equals(availablePromoCode1))
		{
			double netDiscountedPrice1 = 0.95*grossDiscountPrice;
			System.out.println("final cost of the products after discount is "+netDiscountedPrice1);
		}
		else if( enteredPromoCode .equals(availablePromoCode2))
		{
			double netDiscountedPrice2 = 0.90*grossDiscountPrice;
			System.out.println("final cost of the products after discount is "+netDiscountedPrice2);
		}
			
		else if( enteredPromoCode.equals(availablePromoCode3))
		{
			double netDiscountedPrice3 = 0.80*grossDiscountPrice;
			System.out.println("final cost of the products after discount is "+netDiscountedPrice3);
			
		}
		   
		
		 else // if no special discount is applied
	 {System.out.println("final cost of the products after discount is " +grossDiscountPrice);
	}}
}		

	


