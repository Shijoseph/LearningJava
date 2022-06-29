package objectOriented;

import java.util.Scanner;
public class Person {
	
	String firstName;
	public String lastName;
	Scanner sc = new Scanner(System.in);
	
	String changeLastName()
	{System.out.println("enter the new last name");
	lastName = sc.next();
	return lastName;
	}
	

}
