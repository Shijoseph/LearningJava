package basicsObjectOriented;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj1 = new Calculator();
		obj1.a = 1000;
		obj1.b= 50;
		obj1.addition(obj1.a,obj1.b);
		obj1.substraction(obj1.a,obj1.b);
		obj1.multiplication(obj1.a, obj1.b);
		obj1.division(obj1.a, obj1.b);
	}
}
