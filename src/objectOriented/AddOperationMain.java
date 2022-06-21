package objectOriented;

public class AddOperationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddOperationvalues m1 = new AddOperationvalues();
		
		addoperation m2 = new addoperation();
		
		m1.x = 1000;
		m1.y = 50;
		
		int q = m2.addition(m1.x, m1.y);
		int w = m2.substraction(m1.x, m1.y);
		int e = m2.multiplication(m1.x, m1.y);
		double t = m2.division(m1.x,m1.y);
		
		
		m1.calculatorDetails(m2.calculatorname, m2.calculatortype);
		System.out.println(q);
		System.out.println(w);
		System.out.println(e);
		System.out.println(t);
		
		
		
	}

}
