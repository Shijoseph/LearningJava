package arrays;

import java.util.Scanner;

public class PopulateNamesOfCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] NamesOfCities = new String[3];

		for (int i = 1; i <= NamesOfCities.length; i++)
		{
			System.out.println(" enter the name of the  " +i+ " city");

			NamesOfCities[i-1] = sc.next();
			
		}
		System.out.println("enter the desired city  " );
		String enteredCity = sc.next();
		
		boolean cityfound = false;
		
		

		for (int i = 0; i <NamesOfCities.length; i++)
		
		{		if(NamesOfCities[i].equals(enteredCity))
		{
			
			cityfound =true;
			break;
		}
		
	
		}	

		
		if(cityfound)
		{System.out.println("Welcome to  " + enteredCity);
		
		
		}else
		   System.out.println("entered city   does not match with the list");
		
		  }
	}	



