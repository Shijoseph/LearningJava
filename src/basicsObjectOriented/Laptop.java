package basicsObjectOriented;

public class Laptop {

	// line 5-8 is for step1
	String laptopName;
	int ramSize;
	String processorType;

	// non argument constructor
	Laptop() {
		// TODO Auto-generated constructor stub
	}

	// constructor for step 3
	Laptop(String laptopName3, int ramSize3, String processorType3) {
		laptopName = laptopName3;
		processorType = processorType3;
		ramSize = ramSize3;
	}

	// line 12- 15 for step 2
	void laptopdetails(String l,int r ,String p) {

		laptopName = l;
		ramSize = r;
		processorType = p;

		System.out.println("name of the laptop  " + laptopName);
		System.out.println("ramsize of the laptop " + ramSize);
		System.out.println("processor type of the laptop " + processorType);
	}

}
