package arrays;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] secondArray = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int []thirdArray = {22,4,5,8,33,1,0};
		int[] mergedArray = new int[(firstArray.length + secondArray.length)];
		
		Arrays.sort(thirdArray);
		System.out.println(Arrays.toString(thirdArray));
		System.out.println(firstArray.length);
		System.out.println(secondArray.length);
		System.out.println(firstArray.length+secondArray.length);
		for (int i = 0; i < (firstArray.length); i++) {
			mergedArray[i] = firstArray[i];
			}
		int j = 0;
		
		for (int i = 1; i <= secondArray.length; i++)
				{
			mergedArray[i+firstArray.length-1] = secondArray[j];
			j++;
		}
		System.out.println(Arrays.toString(mergedArray));
	}
}
