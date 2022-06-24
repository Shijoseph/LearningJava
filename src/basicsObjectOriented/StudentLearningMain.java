package basicsObjectOriented;

public class StudentLearningMain {

	public static void main(String[] args) {

		StudentLearning obj1 = new StudentLearning("john", 124, 90, 70);
		StudentLearning obj2 = new StudentLearning(" sam",121,80,85);

		obj1.details();
		System.out.println("percentage obtained " + obj1.getpercentage());
		
		obj2.details();
		System.out.println("percentage obtained " + obj2.getpercentage());

	}

}
