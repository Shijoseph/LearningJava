package conditionalstatment;

public class CompareStringusingBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentance1 = "my name is java";
		String sentance2 = "my name is java";
		String sentance3 = "my name is mava";
		
		boolean isSent1EqualSent2 = sentance1.equals(sentance2);
		boolean isSent1EqualSent3 = sentance1.equals(sentance3);
		boolean isSent2EqualSent3 = sentance2.equals(sentance3);
		
		System.out.println("sentance 1 is equal to sentance 2 "+ isSent1EqualSent2 );
		System.out.println("sentance 1 is equal to sentance 3 "+ isSent1EqualSent3 );
		System.out.println("sentance 2 is equal to sentance 3 "+ isSent2EqualSent3 );
		
		
		
	}

}
