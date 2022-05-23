package conditionalstatment;

public class CheckOptimumSpeed {

	public static void main(String[] args) {
		// to check the whether the car is within the optimum speed in school zone
		
		int speedOfCar1 = 120;
		int speedOfCar2 = 30;
		int optimumSpeed = 30;
		
		boolean isOptimumSpeedCar1 = speedOfCar1 ==optimumSpeed;
		boolean isOptimumSpeedCar2 = speedOfCar2 ==optimumSpeed;
		
		System.out.println( "value of optimum speed for car 1 is "+isOptimumSpeedCar1);
		System.out.println( "value of optimum speed for car 2 is "+isOptimumSpeedCar2);
		

	}

}
