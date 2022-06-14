package arrays;

import java.util.Arrays;

public class SumOfArrayTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] secondArray = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int[] sumOfArray = new int[10];
		for (int i = 0; i < firstArray.length; i++)

		{
			sumOfArray[i] = firstArray[i] + secondArray[i];
		}
		System.out.println(Arrays.toString(sumOfArray));
	}
}
