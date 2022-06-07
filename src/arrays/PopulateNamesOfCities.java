package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateNamesOfCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		String[] namesOfCities = new String[3];

		for (int i = 1; i <= namesOfCities.length; i++)
		{
			System.out.println(" enter the name of the  " +i+ " city");

			namesOfCities[i-1] = sc.next();
			
		}
		System.out.println("enter the desired city  " );
		String enteredCity = sc.next();
		
		
		boolean cityfound = false;
		int valueOfArray =0;
		
		

		for (int i = 0; i <namesOfCities.length; i++)
		
		{		if(namesOfCities[i].equals(enteredCity))
		{
			
			cityfound =true;
			valueOfArray = i;
			break;
		}
		
	
		}	

		
		if(cityfound)
		{System.out.println("Welcome to  " + enteredCity);
		System.out.println("Enter the city to replace");
		String replacedCity = sc.next()	;	
		 namesOfCities[valueOfArray]=replacedCity;
		System.out.println("Names of the cities are" + Arrays.toString(namesOfCities));
		}else
		   System.out.println("entered city   does not match with the list");
		
		  }
	}	



