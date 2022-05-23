package conditionalstatment;

public class IfElseIfCreditScoreCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int creditScore = 444;
		
		if(creditScore>750)
		{System.out.println("very good creditscore" +creditScore);
		}
		else if(500< creditScore && creditScore <750)
		{System.out.println("average credit score "+creditScore);
		}
		else if(creditScore<500)
		{
			System.out.println("not a good score for loan  "+creditScore);
			
		}
		else
		{System.out.println("not elgible for loan    "+creditScore);
		
	}

}
}