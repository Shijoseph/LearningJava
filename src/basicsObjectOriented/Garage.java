package basicsObjectOriented;

public class Garage {
	
	void park (Car car)
	{if(car.carCapacity >=1200)
	{System.out.println("park in the driveway" +car.name);
	}
	else if(car.carCapacity<1000)
	{
		System.out.println("park in the the street"+car.name);
	}
	
	}

}
