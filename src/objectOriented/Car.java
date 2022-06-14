package objectOriented;

public class Car {
	
	String color;
	int makeYear;
	int speed;
	String engine;
	String transmission;
	String model;

	//this type of method does not take any value nor return any value . it will always start with void
	
	void startTheCar()
	{System.out.println("turn the car ignition");
			
	}
	
	
	//this type of method does not take any value but returns a value .it will alway start with a datatype and will always have a return value 
	String getcolor()
	{
		return color;
		
	}
	
	
	int speedIncreasing()
	{
		System.out.println("increase the  speed of car");
		System.out.println("*************");
		speed = 80;
		return speed;
		
	}
		boolean applybrakes()	
		
		{
			System.out.println("apply the brakes");
			System.out.println("*************");
			if (speed>80)
			{return false;
			}
			else {
				
				System.out.println("speed is reduced");
				System.out.println("car stops");
				System.out.println("speed of the car is "+  speed);
				System.out.println("*************");
			}return true;
		}
		  }
		  
		  	 
		 
	



