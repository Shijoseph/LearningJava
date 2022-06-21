package basicsObjectOriented;

public class CalcUsingObject {

	int a = 100;
	int b =44;
	int c = 30;
		 void addition() {
			
			int d = a + b + c;
			System.out.println(" sum of the numbers  " + d);
		}

		 void substraction() {
			

			System.out.println("difference of the numbers  " + (a - b));

		}

		void product()

		{
			
			System.out.println("product of the numbers  " + (a*b));
		}

		void division() {
			

			System.out.println("division of a/b " + (a /b));

		}
		
		void remainder()
		
		{
			
			System.out.println("remainder of a%b "+  (a%b));
		}
		
		public static void main(String[] args) 
		{
			//creating an object to access the method
			
			CalcUsingObject A = new CalcUsingObject();
			
			A.addition();
			A.substraction();
			A.product();
			A.division();
			A.remainder();
			
			
			
			

	}

}
