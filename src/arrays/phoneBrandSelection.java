package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class phoneBrandSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "google pixel6", "googlepixel6 Pro", "googlepixelpro", "googlepixel5" };
		String[] apple = { "iphone12", "iphone12mini", "iphone11mini", "iphone11" };

		String enterTheBrand = " ";

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the brand");

		enterTheBrand = sc.next();
		boolean productFound = false;
		String enterTheProduct = " ";
		switch (enterTheBrand)

		{
		case "samsung": {
			System.out.println("SamSung  products" + Arrays.toString(samsung));

			System.out.println("enter the name of SamSung Product ");
			enterTheProduct = sc.next();
			for (int i = 0; i < samsung.length; i++) {

				if (samsung[i].equals(enterTheProduct)) {

					productFound = true;
					break;
				}

			}

			if (productFound) {
				System.out.println("Product selected is  " + enterTheProduct);

			} else {
				System.out.println("Please select a product from the list");

			}

			break;
		}
		case "google": {
			System.out.println("Google  products" + Arrays.toString(google));

			System.out.println("enter the name of Google Product ");
			enterTheProduct = sc.next();
			for (int i = 0; i < google.length; i++) {

				if (google[i].equals(enterTheProduct)) {

					productFound = true;
					break;
				}

			}

			if (productFound) {
				System.out.println("Product selected is  " + enterTheProduct);

			} else {
				System.out.println("Please select a product from the list");

			}

			break;
		}

		case "apple": {
			System.out.println("Apple products" + Arrays.toString(apple));

			System.out.println("enter the name of Apple Product ");
			enterTheProduct = sc.next();
			for (int i = 0; i < apple.length; i++) {
				// apple[i]=sc.next();

				if (apple[i].equals(enterTheProduct)) {

					productFound = true;
					break;
				}

			}

			if (productFound) {
				System.out.println("Product selected is  " + enterTheProduct);

			} else {
				System.out.println("Please select a product from the list");

			}

			break;
		}

		default: {
			System.out.println("enter a valid brand name");
		}
			sc.close();
		}
	}}
