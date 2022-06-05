package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dayscheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] daysInAWeek = { "1", "5", "3", "4", "5", "6", "7" }; // Initialization block

		System.out.println(daysInAWeek);

		System.out.println("Days in a week " + Arrays.toString(daysInAWeek));

		Scanner sc = new Scanner(System.in);

		System.out.println("Length of Array =" + daysInAWeek.length);


		int index = 0;
		int counter = 0;

		int[] indexArray = new int[daysInAWeek.length];

		for (int i = 0; i < daysInAWeek.length; i++) {

			if (daysInAWeek[i].equals("5")) {
				index = i;
				indexArray[i] = 5;
				counter++;

				System.out.println("Index at which 5 is stored : " + index);

			}
		}



		System.out.println("5 exists in array this no of times " + counter);

		System.out.println("5 exists at indexs " + Arrays.toString(indexArray));

	}

}
