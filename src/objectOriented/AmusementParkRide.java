package objectOriented;

public class AmusementParkRide {
	
 
	

	String parkname ="wonderla";
	String  parkaddress  = "123 street Ontario ,canada";
	
	boolean checkEligibility(int height, int weight)

	{
		if ((height > 90 && height < 200) && (weight > 15 && weight < 95)) 
		
		{//System.out.println("eligible  for ride");
			return true;
		} else {
			//System.out.println(" not eligible  for ride");
			return false;
		}
	}
	

}
