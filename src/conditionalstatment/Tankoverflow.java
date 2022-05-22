package conditionalstatment;

public class Tankoverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tankcapacity = 100;
		int bucketcapacity = 10;
		int currentcapacity = 92;
		while (currentcapacity <95) {
			currentcapacity = currentcapacity + bucketcapacity;
			System.out.println("tax is filled"+ currentcapacity);
		}
	

	}

}
