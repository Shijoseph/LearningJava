package arrays;

import java.util.Scanner;

public class SumOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] enteredNumber = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int product =1;
		for(int i=0;i<enteredNumber.length;i++)
		{ System.out.println("enter the number");
			enteredNumber[i] = sc.nextInt();
		
	} for (int i=0;i<enteredNumber.length;i++)
	{sum =sum+enteredNumber[i];
	product = product*enteredNumber[i];
	}
	System.out.println("sum of the entered number  =  " + sum);
	System.out.println("product of the entered number  = " + product);
}

}