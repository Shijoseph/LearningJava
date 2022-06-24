package basicsObjectOriented;

public class Invoice {

	double totalprice;
	
	double finalPrice(Product p,int quantity)
	{
		totalprice = p.price * quantity;
		return totalprice;
	}

}