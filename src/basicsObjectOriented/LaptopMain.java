package basicsObjectOriented;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// obj1 is for step 1
		Laptop obj1 = new Laptop();

		// obj2 is for step 2
		Laptop obj2 = new Laptop();

		// obj3 is for step 3

		// step 1 initialize all variables using object
		// line 20 -26 is for step 1
		obj1.laptopName = "Dell";
		obj1.processorType = "i5";
		obj1.ramSize = 8;

		System.out.println("name of the laptop  " + obj1.laptopName);
		System.out.println("ramsize of the laptop " + obj1.ramSize);
		System.out.println("processor type of the laptop " + obj1.processorType);

		System.out.println();

		// line 31 is for step 2
		obj2.laptopdetails("apple", 4, "i4");

		// for step 3
		Laptop obj3 = new Laptop("HP", 4, "intel2");

		System.out.println();
		System.out.println("name of the laptop  " + obj3.laptopName);
		System.out.println("ramsize of the laptop " + obj3.ramSize);
		System.out.println("processor type of the laptop " + obj3.processorType);
	}

}
