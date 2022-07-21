package rocketPrototypeSimulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


	
public	class Simulation
	{int size=0;
	String splitLine;
		
	void loadItems() throws IOException
		{
		BufferedReader bufReader = new BufferedReader
				(new FileReader("D:\\Study Shijo\\Q A Automation\\java rocket launchassignment\\phase-1.txt"));
		List<String> listOfLines = new ArrayList<>();
	
		String line = bufReader.readLine(); 
		//List<String> sw = new ArrayList<String>();
		while (line != null)
		{ listOfLines.add(line); 
		
		String str[] = line.split("=");
		
		listOfLines = Arrays.asList(str);}
		
		for(String s: listOfLines){
		   System.out.println(s);
		
		
		
	//	size =listOfLines.size();
		
		} bufReader.close();
		
	
	//	System.out.println(size);
	//	System.out.println(listOfLines);
		
		}
		
	
		}

		
	

