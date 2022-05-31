package assignment29may2022;

import java.util.Scanner;

public class TemperatureTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String enteredUnitofTemp= "";
	      System.out.println(" to convert celsius to farhenhiet enter  C or ");
	      System.out.println("to convert farhenheit to celsius enter F");
			Scanner sc = new Scanner(System.in);
			enteredUnitofTemp = sc.next();
			String UnitInCelsius1 = "c";
			String UnitInCelsius2 = "C";
			String UnitInFarhenhiet1 = "f";
			String UnitInFarhenhiet2 = "F";
			double tempInCelsius =0.00;
			double tempInFarhenhiet =0.0;
			if(enteredUnitofTemp.equals(UnitInCelsius1) || enteredUnitofTemp.equals(UnitInCelsius2))//to verify if the entered string for celsius is correct
				
			{
			System.out.println("enter the  value of temperature in Celsius");
			
			 tempInCelsius = sc.nextDouble();
			
			double tempInCelsiusFortable = tempInCelsius-25;
			
			while(tempInCelsiusFortable<=25)// to display value in the range +- 25 for celsius
			{
			
			double convertedTempInFarhenheit = (tempInCelsiusFortable*1.8)+32;//formula for celsius to farhenheit
			
			System.out.println( "CELSIUS            FARHENHIET");
			
			System.out.println( tempInCelsiusFortable + "        "+ convertedTempInFarhenheit);
			
			tempInCelsiusFortable = tempInCelsiusFortable+5;
			
		}
			//to check if value entered is in farhenheit
			}	if(enteredUnitofTemp.equals(UnitInFarhenhiet1) || enteredUnitofTemp.equals(UnitInFarhenhiet2))//to verify if entered string for farhenhiet is correct
				
			{
			System.out.println("enter the  value of temperature in Farhenhiet");
			
			 tempInFarhenhiet = sc.nextDouble();
			
			double tempInFarhenhietFortable =tempInFarhenhiet-25;
			
			
			//to display value in the range +- 25 for celsius
			while(tempInFarhenhietFortable<=25)
			{
				
			
			
			double convertedTempInCelsius = (tempInFarhenhietFortable-32)*0.55555;// formula for farhenheit to celsius
			
			System.out.println( "Farhenheit            Celsius");
			
			System.out.println( tempInFarhenhietFortable + "        "+ convertedTempInCelsius);
			
			tempInFarhenhietFortable = tempInFarhenhietFortable+5;			}
	}}

}
