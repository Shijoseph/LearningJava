package basicsObjectOriented;

import java.util.Scanner;
public class AreaOfRectangleMain {

	public static void main(String[] args) 
	{
		AreaOfRectangle obj1 = new AreaOfRectangle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value for length");
		
		int length = sc.nextInt();
		
		System.out.println("enter the value for breadth");
		int breadth = sc.nextInt();
		
		obj1.setDim(length, breadth);
		System.out.println("area of the rectangle "  +obj1.getArea());

	}

}
