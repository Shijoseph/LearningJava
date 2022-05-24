package assignment22may2022;

public class PromDiscountCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalCostPrice = 100.00;
		double grossDiscountPrice = .50*totalCostPrice;
		
		String availablePromoCode1 = "Promo5";
		String availablePromoCode2 = "Promo10";
		String availablePromoCode3 = "Promo20";
		
		String enteredPromoCode = "Promo100";
		
		if( enteredPromoCode ==availablePromoCode1)
		{
			double netDiscountedPrice1 = 0.95*grossDiscountPrice;
			System.out.println("final cost of the products after discounted is "+netDiscountedPrice1);
		}
		else if( enteredPromoCode ==availablePromoCode2)
		{
			double netDiscountedPrice2 = 0.90*grossDiscountPrice;
			System.out.println("final cost of the products after discounted is "+netDiscountedPrice2);
		}
			
		else if( enteredPromoCode ==availablePromoCode3)
		{
			double netDiscountedPrice3 = 0.80*grossDiscountPrice;
			System.out.println("final cost of the products after discounted is "+netDiscountedPrice3);
			
		}else
		{
			System.out.println("final cost of the products after discounted is "+grossDiscountPrice);
		}
	}}
			

	


