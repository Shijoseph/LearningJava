package basicsObjectOriented;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		int serialnumber = 0;
		double finalprice = 0;
		boolean ifWantToContinue = true;
		double finalCostPriceAfterTax = 0.0;

		Invoice invoiceDetails = new Invoice();

		Product[] productList = new Product[10];

		Product biscuit = new Product("britannia", 10, "bakedbiscuit");
		Product vegetable = new Product("tomato", 20, "romatomato");
		Product fruit = new Product("grape", 30, "ripe");
		Product yogurt = new Product("igoo", 40, "vanilla flavour");
		Product colddrink = new Product("coke", 50, "dietcoke");
		Product coffee = new Product("brookebond", 60, "lightflavour");
		Product tea = new Product("nescafe", 70, "sugarfree");
		Product chocolate = new Product("lindt", 80, " dark chocolate");
		Product icecream = new Product("amul", 90, "chocolate");
		Product cheese = new Product("oldcheeso", 100, "mozarella");

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

		System.out.println("       Product details       ");

		for (int i = 0; i < productList.length; i++)

		{
			System.out.println("SERIAL NUMBER =   " + i);

			System.out.println("product name =   " + productList[i].name + ",   price =   " + productList[i].price
					+ ",   description =   " + productList[i].description);

		}

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the serial number");

			serialnumber = sc.nextInt();

			System.out.println("enter the quantity");

			int quantity1 = sc.nextInt();

			for (int j = 0; j < productList.length; j++)

			{

				if (serialnumber == j) {
					finalprice = finalprice + invoiceDetails.finalPrice(productList[j], quantity1);
					break;
				} else {
					System.out.println("enter a valid serial number");
					break;
				}
			}
			System.out.println("do you want to shop more , enter true/false");

			ifWantToContinue = sc.nextBoolean();
		} while (ifWantToContinue);

		System.out.println("costprice before tax =   " + finalprice);
		finalCostPriceAfterTax = ((113 * finalprice) / 100);

		System.out.println("costprice after tax =   " + finalCostPriceAfterTax);

	}
}
