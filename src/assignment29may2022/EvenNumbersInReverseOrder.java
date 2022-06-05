package assignment29may2022;

public class EvenNumbersInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using for loop

		for (int number = 100; number >= 2; number --)// number in reverse order as mentioned in the question
		{
			if(number%2 ==0)
			{
			System.out.println("the even number is  = " + number);

		}else {
			System.out.println("the number is odd = "  +number);
		}

	}
	}}
