package assignment22may2022;

import java.util.Scanner;

public class PromDiscountCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		String availablePromoCode1 = "Promo5";
		String availablePromoCode2 = "Promo10";
		String availablePromoCode3 = "Promo20";
		
		String enteredPromoCode = "";
		
		System.out.println("enter the promocode");
				
		Scanner sc = new Scanner(System.in);

		enteredPromoCode = sc.next();
		
		System.out.println("enter the total Cost Price");

		double totalCostPrice =0.00;
		totalCostPrice =sc.nextDouble();
		double grossDiscountPrice = .50*totalCostPrice;
	
		if( enteredPromoCode.equals(availablePromoCode1))
		{
			double netDiscountedPrice1 = 0.95*grossDiscountPrice;
			System.out.println("final cost of the products after discounted is "+netDiscountedPrice1);
		}
		else if( enteredPromoCode .equals(availablePromoCode2))
		{
			double netDiscountedPrice2 = 0.90*grossDiscountPrice;
			System.out.println("final cost of the products after discounted is "+netDiscountedPrice2);
		}
			
		else if( enteredPromoCode.equals(availablePromoCode3))
		{
			double netDiscountedPrice3 = 0.80*grossDiscountPrice;
			System.out.println("final cost of the products after discounted is "+netDiscountedPrice3);
			
		}
		   
		
		 else
	 {System.out.println("final cost of the products after discounted is " +grossDiscountPrice);
	}}
}		

	


