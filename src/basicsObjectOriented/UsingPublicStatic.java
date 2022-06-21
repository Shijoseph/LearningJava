package basicsObjectOriented;

public class UsingPublicStatic {

	//4 method are defined  variable are specifically defined inside each method.
	//variable defined in the class level cannot be used directly -as methods are defined as static
	// to use class level variable we will have to remove public static from the method
	
	public static void addition() {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = a + b + c;
		System.out.println(" sum of the numbers  " + d);
	}

	public static void substraction() {
		int a = 100;
		int b = 24;

		System.out.println("difference of the numbers  " + (a - b));

	}

	public static void product()

	{
		int a = 24;
		int b = 23;
		System.out.println("product of the numbers  " + (a * b));
	}

	public static void division() {
		int a = 100;

		int b = 44;

		System.out.println("division of a/b " + (a /b));

	}
	
	public static void remainder()
	
	{
		int a =100;
		int b = 44;
		
		System.out.println("remainder of a%b "+  (a%b));
	}

	
	public static void main(String[] args) 
	{
		UsingPublicStatic.addition();
		UsingPublicStatic.substraction();
		UsingPublicStatic.product();
		UsingPublicStatic.division();
		UsingPublicStatic.remainder();
	}

}
