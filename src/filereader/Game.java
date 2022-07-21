package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] moviesnames = new String[25];
		char enteredLetter;
		String nameWithoutSpace;
		String line;
		
		int count;
		int finalCounter = 1;
		int w;
		int r=0;
		Random object = new Random();
		Scanner sc = new Scanner(System.in);
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("D:\\Study Shijo\\Q A Automation\\assignment\\New folder\\movies.txt"));

			for (int s = 0; s < 25; s++) {
				line = reader.readLine();
				moviesnames[s] = line;
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		int randomNumber = object.nextInt(moviesnames.length);

		System.out.println("\n");
		System.out.println("the randomly generate movie from the list =  " + moviesnames[randomNumber].toUpperCase());

		System.out.println("######  Welcome to the game  ######");
		System.out.println("you have ten chances the guess the correct name");

		nameWithoutSpace = moviesnames[randomNumber].replaceAll("\\s", "");

		char[] character = nameWithoutSpace.toCharArray();
		char[] dummy = new char[nameWithoutSpace.length()];

		for (int j = 0; j < nameWithoutSpace.length(); j++) {
			dummy[j] = '-';
		}
		System.out.println(character);
		System.out.println(dummy);

		
		
		for (int k = 0; k < 50; k++)

		{
			if (Arrays.equals(dummy, character)) {
				System.out.println("you have won the game");
				break;
			}
			if (finalCounter >= 10) {
				System.out.println("you have exhausted the chances play again");
				break;
			}
			w = 0;
			count = 0;
			
			enteredLetter=' ';
			

			System.out.println("enter the letter ");

			enteredLetter = sc.next().charAt(0);

			for (int s = 0; s < character.length; s++) {

				if (enteredLetter == character[s]) {

					dummy[s] = character[s];

					System.out.println(dummy);
					count = 1;
				}

				else {
					w = 1;
				}

			}
			 
			
			if (w == 1 && count == 0 ) {
				System.out.println("you have entered a wrong letter,  attempts left  " + (10 - finalCounter));
				finalCounter++;
				r=0;

			}

			
		}
	}

}

