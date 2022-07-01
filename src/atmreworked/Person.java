package atmreworked;

public class Person {

	long atmCardNumber;
	private int atmCardPin;
	String accountHoldersName;
	String accountType;
	  double accountBalance;
	 final int dailyLimit=1500;
	
	Person()
	{

	}

	public Person(long atmCardNumber, int atmCardPin, String accountHoldersName, double accountBalance,
			String accountType) {

		this.atmCardNumber = atmCardNumber;
		this.atmCardPin = atmCardPin;
		this.accountHoldersName = accountHoldersName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;

	}
// to display persons details
	public void accountdetails(Person []person,int i) {
		System.out.println("name of the accoutn holder is = " + person[i].accountHoldersName);
		System.out.println("account type is  = " + person[i].accountType);
		System.out.println(" balance in the account is  " + person[i].accountBalance);

	}
// to validate account details
	public boolean ValidateAccount(Person[]person, long AtmCardNum,int i) {

		if (person[i].atmCardNumber == AtmCardNum)

		{
			System.out.println("card validation successful");
			return true;
		}

		else

			System.out.println("card validation failed");
		return false;
	}
//to validate pin details
	public boolean validatePin(Person []person, int atmPin,int i)

	{
		if (person[i].atmCardPin == atmPin)

		{System.out.println("pin validation successful");
			return true;

		}

		else
			
			System.out.println("PIN validation failed");
		return false;

	}
// to validate deposit limit
	public boolean checkDepositLimit(Person[] person, int depositAmount)

	{
		if (depositAmount < dailyLimit) {
			System.out.println("Deposit accepted  " + depositAmount);
			
			return true;
		} else
			
			
		return false;

	}
// to deposit amount
	public double deposit(Person [] person, int depositAmount,int i) {

		accountBalance = person[i].accountBalance + depositAmount;
		return accountBalance;

	}
//to validate withdrawal limit	
	public boolean checkWithdrawalLimit(Person [] person, int withdrawalAmount )

	{
		if (withdrawalAmount < dailyLimit) {
			
			
			return true;
		} else
			
		return false;
	
	}
//to withdraw amount
	public double withdrawal(Person[]  person, int withdrawalAmount,int i) {

		{if( withdrawalAmount < person[i].accountBalance)
		{System.out.println("Withdrwal processing");
			accountBalance = person[i].accountBalance - withdrawalAmount;
			return accountBalance;

		}
		else if (withdrawalAmount >= person[i].accountBalance)
		System.out.println("Account balance "+ person[i].accountBalance + "is less than or equal to  withdrawal amount");
		return accountBalance;
		}
		}
	}


