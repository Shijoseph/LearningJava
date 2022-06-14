package objectOriented;

import java.util.Scanner;

public class PersonForRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AmusementParkRide ride = new AmusementParkRide();
		
		double heightNew = 0.0;
		double weightNew = 0.0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the height");
		heightNew = sc.nextDouble();
		
		System.out.println("enter the weight");
		weightNew = sc.nextDouble();
		
		
		ride.entereddetails(heightNew, weightNew);
		ride.ifeligibleforride();
	}

}
