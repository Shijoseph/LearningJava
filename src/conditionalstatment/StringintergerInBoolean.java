package conditionalstatment;

public class StringintergerInBoolean {

	public static void main(String[] args)
	{
		//Initializing types of balance
		
		double avgMonthlyBalance = 5000;
		
		double cust1monthlyBal = 5500.55;
		double cust2monthlyBal = 225.00;
		double cust3monthlyBal = 222;
		
		//Initializing types of card
		String requiredCardType= "Gold";
		String cust1CardType= "Gold";
		String cust2CardType = "Silver";
		String cust3CardType = "Platinum";
		// check if customers card type is eligible
		
		boolean ifCust1TypeEligible = cust1CardType.equals(requiredCardType);
		boolean ifCust2TypeEligible = cust2CardType.equals(requiredCardType);
		boolean ifCust3TypeEligible = cust3CardType.equals(requiredCardType);
		
		//check if customers balance is above required monthly balance
		
		boolean ifCust1BalEligible =cust1monthlyBal >= avgMonthlyBalance;
		boolean ifCust2BalEligible =cust2monthlyBal >= avgMonthlyBalance;
		boolean ifCust3BalEligible =cust3monthlyBal >= avgMonthlyBalance;
		
		////final eligibility
		
		boolean ifCust1eligible = ifCust1BalEligible && ifCust1TypeEligible;
		boolean ifCust2eligible = ifCust2BalEligible && ifCust2TypeEligible;
		boolean ifCust3eligible = ifCust3BalEligible && ifCust3TypeEligible;
		////display value
		
		System.out.println("customer 1 is eligible for Premium Card  "+ ifCust1eligible);
		System.out.println("customer 2 is eligible for Premium Card  "+ ifCust2eligible);
		System.out.println("customer 3 is eligible for Premium Card  "+ ifCust3eligible);
		
		
		
		
		
		

}
}
