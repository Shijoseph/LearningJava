package basicsObjectOriented;

public class Invoice1 {

	double totalPrice = 0;

	double finalInvoice(Product1[] productdetails) {
		for (int s = 0; s < productdetails.length; s++) {

			totalPrice += productdetails[s].price * productdetails[s].quantity;

		}
		// totalPrice= valueAfterTax(1.13);
		// return totalPrice;
		return valueAfterTax(1.13);
	}

	private double valueAfterTax(double taxPercent) {
		return totalPrice * taxPercent;

	}
}
