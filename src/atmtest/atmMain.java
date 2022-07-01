package atmtest;

import java.util.Scanner;

public class atmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person[] customerList = new Person[5];

		customerList[0] = new Person(123456789, 1111, "John A", 256.50, "Chequing");
		customerList[1] = new Person(678901234, 2222, "David H", 4500, "Saving");
		customerList[2] = new Person(543216789, 3333, "Rahul K", 7400, "Chequing");
		customerList[3] = new Person(778760007, 2222, "Rohit S", 780, "Saving");
		customerList[4] = new Person(741257852, 5554, "Sarah J", 5000, "Chequing");

		Person obj1 = new Person();

		long atmCardNum = 0;
		int pinNum = 0;
		int arrayNum = 0;
		int valueForOption = 0;
		int withDrawalAmount = 0;
		int depositAmount = 0;
		boolean ifAccountCorrect = false;
		boolean ifPinIsCorrect = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ABC Bank");
		System.out.println("Please enter the 9-digit ATM CARD");
		atmCardNum = sc.nextLong();

		System.out.println("Please enter the 4 digit ATM pin number ");
		pinNum = sc.nextInt();

		for (int i = 0; i < customerList.length; i++) {
			if (customerList[i].atmCardNumber == atmCardNum) {
				arrayNum = i;
				ifAccountCorrect = obj1.ValidateAccount(customerList, atmCardNum, arrayNum);

				ifPinIsCorrect = obj1.validatePin(customerList, pinNum, arrayNum);

			}

		}

		if (ifAccountCorrect)

		{
			System.out.println("card validation successful");

			if (ifPinIsCorrect) {
				System.out.println("pin validation successful");

				System.out.println("Choose 1 to Withdraw");
				System.out.println("Choose 2 to Deposit");
				System.out.println("Choose 3 to check balance");
				System.out.println("choose 4 to exit ");

				valueForOption = sc.nextInt();

	
				{
					switch (valueForOption) {
					case 1: {

						obj1.accountdetails(customerList, arrayNum);
						System.out.println("enter the amount to be withdrawn");
						withDrawalAmount = sc.nextInt();

						if (obj1.checkWithdrawalLimit(customerList, withDrawalAmount)) {
							System.out.println("Account balance after withdrawal is  "
									+ obj1.withdrawal(customerList, withDrawalAmount, arrayNum));
							ifPinIsCorrect = false;
							break;
						} else
							System.out.println(
									"Withdrawal limit exceeds dailiy limit of 1500,kindly enter amount less than 1500");

						ifPinIsCorrect = true;
						break;

					}

					case 2: {
						obj1.accountdetails(customerList, arrayNum);
						System.out.println("enter the amount to deposit");
						depositAmount = sc.nextInt();

						if (obj1.checkDepositLimit(customerList, depositAmount)) {
							System.out.println("Account balance after withdrawal is  "
									+ obj1.deposit(customerList, depositAmount, arrayNum));
							ifPinIsCorrect = false;
							break;

						} else
							System.out.println(
									"Deposit amount limit exceeds dailiy limit of 1500,kindly enter amount less than 1500");

						ifPinIsCorrect = true;
						break;
					}
					case 3: {
						obj1.accountdetails(customerList, arrayNum);

					}
					default: {
						System.out.println();

					}

					}

			}}
			else {
				System.out.println("PIN validation failed");

			}
		} else {
			System.out.println("card validation failed");
		}

	}
}
