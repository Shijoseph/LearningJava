package randomClass;



import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		
		String[] words = new String[25];
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
				words[s] = line;
				System.out.println(line);
			}

			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		int randomNumber = object.nextInt(words.length);

		System.out.println("\n");
		System.out.println("the randomly generate movie from the list =  " + words[randomNumber].toUpperCase());

		System.out.println("######  Welcome to the game  ######");
		System.out.println("you have ten chances the guess the correct name");
		
		nameWithoutSpace = words[randomNumber].replaceAll("\\s", "");
		String y ="*";
		
		
	        
	        char game;
	        do {
	            int length = object.nextInt(words.length);
	            String word = words[length];
	            StringBuilder guess = new StringBuilder();
	        //    guess.append("*".repeat(word.length()));
	            int yes = 0, no = 0;
	            while (yes < word.length()) {
	                System.out.println("guess word:"  + guess);
	                System.out.print("Please enter a letter:" );
	                char letter = sc.next().charAt(0);
	                
	                if(guess.indexOf(String.valueOf(letter))>= 0 )
	                    System.out.println( letter )  ;
	                
	                    if(word.indexOf(letter )<0 ){
	                    System.out.println("Letter" + letter +"not in a word" );
	                       
	                    no++;
	                }
	                else {
	                    int index = word.indexOf(letter);
	                    while(index >=0){
	                        guess.setCharAt(index, letter);
	                        yes++;
	                        index = word.indexOf(letter, index +1);}} }
	            System. out. println( word);
	                             
	            System.out.println(    	             "you guessed it wrong"  + no + " Times" );
	            System.out.print("Whether to continue the game (Y/N):");
	            game = sc.next().charAt(0);
	        } while (game == 'Y');
	    }
}


