package assignment29may2022;

import java.util.Scanner;

public class HeightConverter {

	
	
	public static void main(String[] args) {
		
		
		//initialising the variable to input the height of a person
		// we have divided the height of a person in two input 
		
		int enteredHeightinFeet=0;//the variable enteredHeightInFeet will have the  height of the person in feet
		int enteredHeightinInches = 0;// the variable HeightIn Inches will have the height of the person  in inches
		
		System.out.println("enter the height of the person in feet");
		
		Scanner sc = new Scanner(System.in);
		enteredHeightinFeet = sc.nextInt();
		
		System.out.println("enter the  inche part of the height");
		
		
		
		enteredHeightinInches = sc.nextInt();
		
		if(enteredHeightinInches<=12)
		{
		
		
		double totalHeightinCm= (30.48*enteredHeightinFeet) + (2.54*enteredHeightinInches);// using a third variable we calculate the height in centimetre
		
		System.out.println("height of the person in centimetres  =  "  +totalHeightinCm);// priting the value
		
		
	}
		else {
			
			System.out.println("enter a value for inches ,should be in range 1-11");
		}
		}


}
