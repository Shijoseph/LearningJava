package basicsObjectOriented;

public class InvoiceOfLaptop {

	double priceOftheLaptop=0;
	double priceAfterTax=0;
	
	double invoicedetails(Laptop L)
	{
		priceOftheLaptop +=L.price*L.quantity;
		return priceOftheLaptop;
	}
	
	double taxdetails()
	
	{priceAfterTax = priceOftheLaptop*1.03;
	return priceAfterTax;
	}
}

