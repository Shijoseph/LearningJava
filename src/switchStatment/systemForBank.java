package switchStatment;

import java.util.Scanner;

public class systemForBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int option =0;
		double balance = 500;
		double creditCardBalance = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an option");
		option = sc.nextInt();
		
		
		switch(option)
		{
		case 1:{
			System.out.println("Account Balance  ="+ balance);
			break;
		}
		
		case 2 :{
			System.out.println("types of account "+ "saving or chequing");
			break;
		}
		case 3:{
			System.out.println("Credit Card Balance  = "+creditCardBalance);
			break;
		}
		default:{
			System.out.println("enter a valid input");
		}
		}
		
		
	}

}
