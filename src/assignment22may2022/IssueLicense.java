package assignment22may2022;

import java.util.Scanner;

public class IssueLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageOfDriver = 0;
				System.out.println("enter the age of the driver");// to be displayed in console to enter the value
		
		
		Scanner sc = new Scanner(System.in);
		ageOfDriver =sc.nextInt()//value from the console is stored
;		
		String licenseType ="";
		System.out.println("enter the license type");// to be displayed in console to enter the value
		licenseType = sc.next();// value entered in the console is stored
		
		// use if else to check the different conditions
		
		if(ageOfDriver >=16 && licenseType.equals("g1"))
			
		{ System.out.println("current license for the driver is G1");
		System.out.println("driver is eligible to apply for G2");
		}
		else if(ageOfDriver >=16 && licenseType.equals("G1"))
		{System.out.println("current license for the driver is G1");
		System.out.println("driver is eligible to apply for G2");
		}
		else if(ageOfDriver >=16 && licenseType.equals("g2"))
		{System.out.println("current license for the driver is g2");
		System.out.println("driver is eligible to apply for G");
	}
		else if(ageOfDriver >=16 && licenseType.equals("G2"))
		{System.out.println("current license for the driver is G2");
		System.out.println("driver is eligible to apply for G");
		
		}else if(ageOfDriver >=16 && licenseType.equals("G"))
		{System.out.println("current license for the driver is G");
		System.out.println("driver is eligible to reissue G");
		}
		
		else if(ageOfDriver >=16 && licenseType.equals("g"))
		{System.out.println("current license for the driver is G");
		System.out.println("driver is eligible to reissue G");
		}
		
		else if(ageOfDriver >=16 && licenseType.equals(" "))
		{System.out.println("enter a valid license type");
		}
		else// if age is <16
		{System.out.println("not eligible for drivers license");
}}}