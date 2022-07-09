
package basicsObjectOriented;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Garage garage = new Garage();
		Car car = new Car("BMW","petrol",1200,"red",25000);
		Car car1 = new Car("Benz","petrol",100,"white",25000);
		garage.park(car);
		garage.park(car1);

	}

}
