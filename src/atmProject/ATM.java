package atmProject;

public class ATM {

	long atmCardNumber;
	int atmCardPin;
	String accountHoldersName;
	String accountType;
	double accountBalance;

	ATM()

	{
	}

	public ATM(long atmCardNumber, int atmCardPin, String accountHoldersName, double accountBalance,
			String accountType) {

		this.atmCardNumber = atmCardNumber;
		this.atmCardPin = atmCardPin;
		this.accountHoldersName = accountHoldersName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;

	}

	
	
	public void accountdetails(ATM A)
	{System.out.println("name of the accoutn holder is = "+ A.accountHoldersName);
	System.out.println("account type is  = "+ A.accountType);
	System.out.println(" balance in the account is  " + A.accountBalance);

	}
	public boolean validation(ATM A, int atmPin, long atmCardNum)

	{
		if(A.atmCardNumber == atmCardNum &&(A.atmCardPin == atmPin))

			
			  {
				return true;

		
		}

		else
			System.out.println("validation failed");
		return false;

	}

	public double deposit(ATM A, int depositAmount) {

		accountBalance = A.accountBalance + depositAmount;
		return accountBalance;

	}

	public double withdrawal(ATM A,  int withdrawalAMount) {

		{
			accountBalance = A.accountBalance - withdrawalAMount;
			return accountBalance;

		}
		
		}

	}


