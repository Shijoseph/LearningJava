package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] moviesnames = new String[25];
		char enteredLetter;
		boolean ifValueMatches;
		String nameWithoutSpace;
		String line;
		int count = 0;
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
			dummy[j] = '?';
		}
		System.out.println(character);
		System.out.println(dummy);

		for (int k = 0; k < nameWithoutSpace.length(); k++) {
			System.out.println("enter the letter ");
			enteredLetter = sc.next().charAt(0);
			for (int s = 0; s < character.length; s++) {
				if (enteredLetter == character[s]) {
					
					dummy[s] = character[s];
					System.out.println(dummy);
					
			

			}

		}
		

	}
}
}
