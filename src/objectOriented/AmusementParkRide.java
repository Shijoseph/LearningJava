package objectOriented;

import java.util.Scanner;

public class AmusementParkRide {

	double height;
	double weight;
	

	
	
	void entereddetails(double newHeight1,double newWeight1 )
	{
		height = newHeight1;
		weight = newWeight1;
		
		
	}
	
	void ifeligibleforride()
	{
		if(height>=90 && height<=200)
	{ if(weight>=15 && weight <=90)
	{
	System.out.println("eligble for amusement  park ride as height is  " + height  + " and weight is  "+weight);
	}
}
		else
			{System.out.println("not eligible for amusement park ride  as height is  " + height  + " and weight is  "+weight);
	}
}
}