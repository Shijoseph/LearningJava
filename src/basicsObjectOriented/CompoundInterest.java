package basicsObjectOriented;

public class CompoundInterest {

	int princpal;
	int rate;
	int time;
	
	void CompoundMonthly( int p,int r,int t)
	{
		princpal = p;
		rate = r;
		time = t;
		 double  finalrate = rate*0.10;
	 double z = 	( princpal *(1+finalrate/12));
	 double y = t*12;
		
		double value = Math.pow(z, y);
		System.out.println("value of the investement " +value);	
	}
}
