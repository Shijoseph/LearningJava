package assignment29may2022;

import java.util.Scanner;

public class TemperatureUnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String enteredUnitofTemp = "";
		System.out.println(" to convert celsius to farhenhiet enter  C or ");
		System.out.println("to convert farhenheit to celsius enter F");
		Scanner sc = new Scanner(System.in);
		enteredUnitofTemp = sc.next();
		String UnitInCelsius1 = "c";
		String UnitInCelsius2 = "C";
		String UnitInFarhenhiet1 = "f";
		String UnitInFarhenhiet2 = "F";

		if (enteredUnitofTemp.equals(UnitInCelsius1) || enteredUnitofTemp.equals(UnitInCelsius2))// to verify if the
																									// entered string
																									// for celsius is
																									// correct

		{
			System.out.println("enter the  value of temperature in Celsius");

			Double tempInCelsius = sc.nextDouble();

			Double convertedTempInFarhenheit = (tempInCelsius * 1.8) + 32;// formula for celsius to farhenheit

			System.out.println(
					" value of the temperature converted from Celsius to Farhenhiet =  " + convertedTempInFarhenheit);

		}
		if (enteredUnitofTemp.equals(UnitInFarhenhiet1) || enteredUnitofTemp.equals(UnitInFarhenhiet2))// to verify if
																										// entered
																										// string for
																										// farhenhiet is
																										// correct

		{
			System.out.println("enter the  value of temperature in Farhenhiet");

			Double tempInFarhenhiet = sc.nextDouble();

			Double convertedTempInCelsius = (tempInFarhenhiet - 32) * 0.55555;// formula for farhenheit to celsius
			System.out.println(
					" value of the temperature converted from farhenheit to celsius =  " + convertedTempInCelsius);
		}

	}
}
