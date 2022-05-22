
public class SwapNumWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapping two numbers without using a third variable
		
		int firstvalue = 55;
		int secondvalue = 44;
		
		System.out.println("value of first number before swapping  "+firstvalue);
		System.out.println("value of second number before swapping  "+secondvalue);
		
		firstvalue = firstvalue+secondvalue;
		secondvalue = firstvalue-secondvalue;
		firstvalue = firstvalue-secondvalue;
		
		System.out.println("value of first number after swapping  "+firstvalue);
		System.out.println("value of second number after swapping  "+secondvalue);
		
	}

}
