package objectOriented;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student shijo = new Student();

		Student rijo = new Student();

		shijo.name = "Shijo Joseph";
		shijo.background = "banking";
		shijo.age = 31;
		shijo.gender = "male";

		rijo.name = "Rijo Cherian";
		rijo.background = "teaching";
		rijo.age = 31;
		rijo.gender = "male";

		System.out.println("details of first student");

		System.out.println("name of first student  " + shijo.name);
		System.out.println("age of first student  " + shijo.age);
		System.out.println("background of first student  " + shijo.background);
		System.out.println("gender of first student  " + shijo.gender);

		System.out.println("name of second student  " + rijo.name);
		System.out.println("age of first student " + rijo.age);
		System.out.println("background of first student  " + rijo.background);
		System.out.println("gender of first student  " + rijo.gender);

		rijo.learningJava();
	}

}
