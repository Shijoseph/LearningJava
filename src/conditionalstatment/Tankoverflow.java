package conditionalstatment;

public class Tankoverflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tankCapacity = 100;
		int bucketCapacity = 10;
		int currentCapacity = 92;
		while (currentCapacity <95) {
			currentCapacity = currentCapacity + bucketCapacity;
			
		}
		System.out.println("tax is filled"+ currentCapacity);

	}

}
