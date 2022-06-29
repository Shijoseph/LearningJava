package atmProject;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {

		ATM[] customerList = new ATM[5];

		customerList[0] = new ATM(123456789, 1111, "John A", 256.50, "Chequing");
		customerList[1] = new ATM(678901234, 2222, "David H", 4500, "Saving");
		customerList[2] = new ATM(543216789, 3333, "Rahul K", 7400, "Chequing");
		customerList[3] = new ATM(778760007, 2222, "Rohit S", 780, "Saving");
		customerList[4] = new ATM(741257852, 5554, "Sarah J", 5000, "Chequing");

		ATM obj1 = new ATM();

		long atmCardNum = 0;
		int pinNum = 0;
		int arrayNum = 0;
		int valueForOption = 0;
		int withDrawalAmount = 0;
		int depositAmount = 0;

		boolean ifValidationSuccess = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ABC Bank");
		System.out.println("Please enter the 9-digit ATM CARD");
		atmCardNum = sc.nextLong();
		System.out.println("Please enter the 4 digit ATM pin number ");
		pinNum = sc.nextInt();

		for (int i = 0; i < customerList.length; i++) {
			if (customerList[i].atmCardNumber == atmCardNum && (customerList[i].atmCardPin == pinNum)) {
				arrayNum = i;

			}
		}
		ifValidationSuccess = (obj1.validation(customerList[arrayNum], pinNum, atmCardNum));

		if (ifValidationSuccess) {

			System.out.println("Choose 1 to Withdraw");
			System.out.println("Choose 2 to Deposit");
			System.out.println("Choose 3 to check balance");
			System.out.println("Choose 4 to exit");

			System.out.println("enter a valid option");

			valueForOption = sc.nextInt();

			switch (valueForOption)

			{
			case 1:

				obj1.accountdetails(customerList[arrayNum]);

				System.out.println("enter the amount to be withdrawn");
				withDrawalAmount = sc.nextInt();
				

				if (customerList[arrayNum].accountBalance > withDrawalAmount && withDrawalAmount < 1500) {
					System.out.println("balance in the account after withdrawal is  ="+obj1.withdrawal(customerList[arrayNum], withDrawalAmount));
					
				}

				else {
					System.out.println("insufficient amount/daily withdrawl limit is 1500 ");

				}
				break;

			case 2:

				obj1.accountdetails(customerList[arrayNum]);

				System.out.println("enter the amount to deposit");
				depositAmount = sc.nextInt();
				if (depositAmount < 1500) {
					System.out.println("balance in the account after deposit is  = "+obj1.deposit(customerList[arrayNum], depositAmount));

				} else {
					System.out.println("daily deposit limit is 1500");
				}
				break;

			case 3:
				obj1.accountdetails(customerList[arrayNum]);

				break;

			default: {
				System.out.println("invalid selection");

			}
			}
		}

	}
}
