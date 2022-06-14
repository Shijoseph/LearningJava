package objectOriented;


		import java.util.Scanner;

		public class CarMain {

			public static void main(String[] args) {
				
				Car honda = new Car();
				
				Car toyota = new Car();
				
				Car mazda = new Car();
				
				honda.color ="red";
				honda.engine ="petrol";
				honda.makeYear = 2020;
				honda.model= "CRV";
				honda.transmission = "manual";
				
				toyota.color = "black";
				toyota.engine = "petrol";
				toyota.makeYear= 2015;
				toyota.model="camry";
				toyota.transmission = "automatic";
				
				mazda.color = "white";
				mazda.engine ="diesel";
				mazda.makeYear=2011;
				mazda.model=" c10";
				mazda.transmission="automatic";
				
				honda.speedIncreasing();
				honda.applybrakes();
				honda.getcolor();
				
				
	}


}