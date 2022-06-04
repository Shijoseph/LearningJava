package assignment29may2022;

import java.util.Scanner;

public class CheckIfNumberIsPrime {

	// number which divisible by 1 and only by itself 1,3,5,7,11,17,23

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int enteredNumber = 0;
		System.out.println("enter the number to check if it is a prime number");
		Scanner sc = new Scanner(System.in);

		enteredNumber = sc.nextInt();
		int checkDivisibility = 0;
		for (int CheckNum = 1; CheckNum <= enteredNumber; CheckNum++) {

			if (enteredNumber % CheckNum == 0)// this will help to check the divisibility
			{
				checkDivisibility++;
			}
		}
		if (checkDivisibility == 2)// count will always be 2
		{
			System.out.println(enteredNumber + "  is a prime number");

		} else {
			System.out.println(enteredNumber + "  is not a prime number");
		}

	}

}
