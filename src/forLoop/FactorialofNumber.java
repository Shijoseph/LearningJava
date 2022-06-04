package forLoop;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {

		int enteredNumber = 0;
		System.out.println("enter the number ");
		Scanner sc = new Scanner(System.in);

		enteredNumber = sc.nextInt();
		int factorialOfNumber = 1;
		for (int count = 1; count <= enteredNumber; count++) {
			factorialOfNumber = factorialOfNumber * count;

		}
		System.out.println("factorial of a number   = " + factorialOfNumber);

		double num = 5.255;

		System.out.println(Math.round(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.ceil(num));
	}
}
