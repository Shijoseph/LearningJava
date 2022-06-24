package basicsObjectOriented;

public class CompoundInterest {

	int princpal;
	double rate;
	int time;

	void CompoundMonthly(int p, double r, int t) {
		princpal = p;
		rate = r;
		time = t;
		rate = rate/100;
		
		double amount = princpal * Math.pow(1+(rate/time),time*12);
		

		 
		System.out.println("value of the investement " + amount);
	}
}
