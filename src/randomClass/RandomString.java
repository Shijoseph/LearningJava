package randomClass;

import java.util.Random;

public class RandomString {

	public static void main(String[] args) {
		String characters = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!#$%^&*_-+=|";
		String randomEmailAddress = "";
		int length = 5;
		Random object = new Random();
		String domain = "@gmail.com";
		String generatedEmailAddress = "";

		char[] randomvalue = new char[length];

		for (int i = 0; i < length; i++) {
			randomvalue[i] = characters.charAt(object.nextInt(characters.length()));

		}

		for (int j = 0; j < randomvalue.length; j++) {
			randomEmailAddress += randomvalue[j];

		}
		generatedEmailAddress = randomEmailAddress.concat(domain);
		
		System.out.println(" the random email address  is  "+ generatedEmailAddress);
	}
}