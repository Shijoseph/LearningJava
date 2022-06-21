package basicsObjectOriented;

public class CompoundInterestMain {

	public static void main(String[] args) {
		
		CompoundInterest obj1 = new CompoundInterest();
		
		obj1.princpal=5000;
		obj1.rate=5;
		obj1.time=10;
		obj1.CompoundMonthly(obj1.princpal, obj1.rate, obj1.time);
		
		// TODO Auto-generated method stub
		
	}

}
