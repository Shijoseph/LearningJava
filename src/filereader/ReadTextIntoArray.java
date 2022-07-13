package filereader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadTextIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "Sarah", "David", "John", "Samuel", "don" };
		String[] moviesnames = new String[25];
		// int i =0;
		// boolean iftrue = true;
		String line;
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("D:\\study Shijo\\Q A Automation\\assignment\\New folder\\johnoutput.txt"));

			for (String name : names) {
				writer.write("\n");
				writer.write(name);
			}
			writer.write("writing a file for john");
			writer.write("\nwelcome  to the text file");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

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

	}

}