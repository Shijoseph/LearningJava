package encapsulation;

public class CRA {

	int level ;
	String nameOfEmployee;
	
	CRA(int level,String nameOfEmployee)
	{this.level= level;
	this.nameOfEmployee=nameOfEmployee;
	
	}
	public boolean checkifauthorised() {
		if (level > 5 )

		{	System.out.println("name of the employye  " + nameOfEmployee); 
			System.out.println("authorised");
			return true;

		} else {
			System.out.println("name of the employye  " + nameOfEmployee); 
			System.out.println("not authorised");
			return false;
		}

	}
}
