package basicsObjectOriented;

public class Product1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Invoice1 invoiceDetails = new Invoice1();

		Product1[] productList = new Product1[10];

		Product1 biscuit = new Product1("britannia", 10, "bakedbiscuit",5);
		Product1 vegetable = new Product1("tomato", 20, "romatomato",44);
		Product1 fruit = new Product1("grape", 30, "ripe",7);
		Product1 yogurt = new Product1("igoo", 40, "vanilla flavour",9);
		Product1 colddrink = new Product1("coke", 50, "dietcoke",33);
		Product1 coffee = new Product1("brookebond", 60, "lightflavour",7);
		Product1 tea = new Product1("nescafe", 70, "sugarfree",10);
		Product1 chocolate = new Product1("lindt", 80, " dark chocolate",14);
		Product1 icecream = new Product1("amul", 90, "chocolate",22);
		Product1 cheese = new Product1("oldcheeso", 100, "mozarella",6);

		productList[0] = biscuit;
		productList[1] = vegetable;
		productList[2] = fruit;
		productList[3] = yogurt;
		productList[4] = colddrink;
		productList[5] = coffee;
		productList[6] = tea;
		productList[7] = chocolate;
		productList[8] = icecream;
		productList[9] = cheese;
		
		System.out.println("price before tax  ="+invoiceDetails.finalInvoice(productList));
		System.out.println("price after tax =  "+invoiceDetails.valueAfterTax());
	}

}
