package conditionalstatment;

public class ComparisonofNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to compare two number
		int firstNum = 25;
		int secondNum = 33;

		boolean isSmallerNum = firstNum <= secondNum;
		boolean isEqualNum = firstNum == secondNum;
		boolean isGreaterNum = firstNum >= secondNum;

		System.out.println("firstnum is smaller than secondNum num is  " + isSmallerNum);
		System.out.println("firstnum is equal to secondNum num is  " + isEqualNum);
		System.out.println("firstnum is greater than secondNum num  is " + isGreaterNum);

	}

}
