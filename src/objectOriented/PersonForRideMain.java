package objectOriented;

public class PersonForRideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AmusementParkRide rollerCoaster = new AmusementParkRide();




		boolean isEligibleToRide = false;

		PersonForRide john = new PersonForRide();

		john.height = 91;
		john.weight = 90;
		john.name = "John D";
 
		john.postToInsta(rollerCoaster.parkname, rollerCoaster.parkaddress);

		isEligibleToRide = rollerCoaster.checkEligibility(john.height, john.weight);

		System.out.println("eligible to ride " + isEligibleToRide);
		
		System.out.println("   ");

		PersonForRide rahul = new PersonForRide();

		rahul.height = 15;
		rahul.weight = 15;

		rahul.name = "Rahul k";

		rahul.postToInsta(rollerCoaster.parkname, rollerCoaster.parkaddress);

		rollerCoaster.checkEligibility(rahul.height, rahul.weight);

		isEligibleToRide = rollerCoaster.checkEligibility(rahul.height, rahul.weight);
		System.out.println("eligible to ride " + isEligibleToRide);
	}
}
