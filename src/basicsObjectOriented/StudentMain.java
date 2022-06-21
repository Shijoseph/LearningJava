package basicsObjectOriented;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student obj1 = new Student();
		obj1.Studentdetails("john",80 , 70, 88, 94, 74);
		
		
		double percentageObtained = obj1.calculate();
		
		System.out.println("percetnage of marks obtaiend  by "+ obj1.studentName + "  =  "+percentageObtained);
	}

}
