package inheritance;

import java.util.Scanner;

public class BankMainClass {
	
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
	
	CheqingAccount chqAccount = new CheqingAccount();
	chqAccount.depositMoney(1000);
	
	SavingAccount svngAccount = new SavingAccount();
	svngAccount.depositMoney(400);
	

	TFSAAccount tfsaAccount = new TFSAAccount();
	tfsaAccount.depositMoney(5000);
	
	
	System.out.println("Balance in chequing : "+chqAccount.balance);
	
	System.out.println("Balance in Saving : "+svngAccount.balance);
	
	System.out.println("Balance in TFSA : "+tfsaAccount.balance);
	
	System.out.println("enter the amount to be deposited ");
	
	
	
	
}

}
