package arrays;

import java.util.Scanner;
public class MonthOfYearDynamicInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String enterTheMonth = "";
		Scanner sc = new Scanner(System.in);
		
		String[] monthOfYear = new String[12];
		
		for(int i=0;i<monthOfYear.length;i++)
		{
			System.out.println("enter the " +(i+1)+" month ");
			enterTheMonth = sc.next();
			monthOfYear[i] = enterTheMonth;
		}
		
		for(int i=0;i<monthOfYear.length;i++)
			
		{System.out.println("months of the year");
			System.out.println(monthOfYear[i]);
	}

}

}