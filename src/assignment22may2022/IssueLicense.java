package assignment22may2022;

public class IssueLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageOfDriver = 15;
		String licenseType = " ";
		
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
		{System.out.println("current lincese for the driver is G");
		}
		
		else if(ageOfDriver >=16 && licenseType.equals("g"))
		{System.out.println("current lincese for the driver is G");
		}
		
		else if(ageOfDriver >=16 && licenseType.equals(" "))
		{System.out.println("enter a valid license type");
		}
		else
		{System.out.println("not eligible for drivers license");
}}}