package basicsObjectOriented;

public class Invoice1 {
	
	double pricebeforetax=0;
	double priceaftertax=0;
	
	
	double  finalInvoice(Product1[] productdetails)
	{
		for(int s= 0;s<productdetails.length;s++)
		{
			
			pricebeforetax += productdetails[s].price* productdetails[s].quantity;
		}
		return pricebeforetax;
	}
	
	double valueAfterTax()
	{ priceaftertax = pricebeforetax*1.03;
		return priceaftertax;
	}
}

