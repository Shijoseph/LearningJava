package basicsObjectOriented;

public class Calculator {

	int a, b;

	void addition(int x, int y)

	{
		a = x;
		b = y;

		System.out.println("Sum of a & B  =  " + (a + b));

	}

	void substraction(int p, int q) {
		a = p;
		b = q;

		System.out.println("difference of a & B  =  " + (a - b));
	}

	void multiplication(int r, int s) {
		a = r;
		b = s;
		System.out.println("product of a & B  =  " + (a * b));

	}

	void division(int c, int d) {
		a = c;
		b = d;
		System.out.println("divsion of a/b  = " + (a / b));

	}

}
