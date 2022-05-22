
public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swap two numbers
		
		int firstnum = 50;
		int secondnum = 40;
		
		
		System.out.println("value of firstnum before swap  " +  firstnum);
		System.out.println("value of secondnum before swap  " + secondnum);
		int thirdvariable = 0;
		
		thirdvariable = firstnum;
		firstnum = secondnum;
		secondnum = thirdvariable;
		
		System.out.println("value of firstnum after swap  " + firstnum);
		System.out.println("value of secondnum before swap  "  + secondnum);
		
		
		
	}

}
