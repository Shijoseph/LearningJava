package basicsObjectOriented;

public class CalcObjectUsingParameter {
	
	int a ;
	int b;
	int c ;
	
	//variable are declared at class level 
	//non static methods are defined below
	
	//void -does not return any value
	//return type is void
	// no input / / there will be some output based on the statement defined in the method within the {}

		 void addition() {
			
			int d = a + b + c;
			System.out.println(" sum of the numbers  " + d);
		}

		 void substraction() {
			

			System.out.println("difference of the numbers  " + (a - b));

		}

		
		 
		 //return type is int
		 //no input //some output
		 
		 int product()
		 {
			int q = 10;
			int r = 20;
			int s = 30;
			 return q*r*s;
			 
		 
		 }
		 
		 //return type is string
		 // no input,some output
		 
		 String name()
		 
		 { System.out.println(" learning different types of object");
		  String nameOftheProgrammer = "John";
			return nameOftheProgrammer;
			 
		 }
		 
		 //return type is int
		 //x,y input as parameters/arguments and return the value
		 
		 int divsion(int x, int y)
		 {
			 System.out.println( "value of the divsion is  ");
			int  z =x/y;
			return z;
			 
		 
		 }
		 

	public static void main(String[] args) 
	{
		CalcObjectUsingParameter obj = new CalcObjectUsingParameter();
		
		obj.a = 100;
		obj.b = 44;
		obj.c = 4;
		obj.addition();
		obj.substraction();
		System.out.println("  product of the numbers  "+  obj.product());
		
		String s = obj.name();
		System.out.println(s);	
		
		 int result = obj.divsion(44, 12);
		 
		 System.out.println(result);
	
	

	}

}
