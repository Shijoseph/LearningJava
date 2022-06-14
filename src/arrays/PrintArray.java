package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] enteredNumber = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<enteredNumber.length;i++)
		{ System.out.println("enter the number");
			enteredNumber[i] = sc.nextInt();
		
	}for (int i = 0;i<enteredNumber.length;i++)
	{System.out.println(enteredNumber[i]);

}System.out.println(Arrays.toString(enteredNumber));
	}
}
