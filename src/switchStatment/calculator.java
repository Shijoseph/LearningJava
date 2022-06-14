package switchStatment;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double enteredFirstNumber = 0.0;
		double enteredSecondNumber = 0.0;
		String enteredOperator = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the first number ");
		enteredFirstNumber = sc.nextDouble();

		System.out.println("enter the second number ");
		enteredSecondNumber = sc.nextDouble();

		System.out.println("  enter the required operator ");
		enteredOperator = sc.next();
		double result=0;
		switch (enteredOperator) {
		case "+": {
			 result = enteredFirstNumber + enteredSecondNumber;
			System.out.println("sum of the entered numbers is  " + result);
			break;
		}

		case "-": {
			 result = enteredFirstNumber - enteredSecondNumber;
			System.out.println("difference of the entered numbers is  " + result);
			break;
		}

		case "*": {
			 result = enteredFirstNumber * enteredSecondNumber;
			System.out.println("product of the entered numbers is  " + result);
			break;
		}

		case "/": {
			result = enteredFirstNumber / enteredSecondNumber;
			System.out.println("division of the entered numbers is  " + result);
			break;
		}
		default: {
			System.out.println("enter a valid operator");
		}
		}
	}
}