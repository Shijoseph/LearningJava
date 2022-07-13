package filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
 
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader reader = new BufferedReader(new FileReader("D:\\Study Shijo\\Q A Automation\\assignment\\New folder\\movies.txt"));
              while (strLine != null)
               {
                strLine = reader.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = reader.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
         System.out.println(Arrays.toString(list.toArray()));
             reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
     }

		
	}


	
