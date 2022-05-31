package assignment29may2022;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberCount=0;
		String willtheNumberBeEntered= "";
		double enteredNumber = 0.0;
		String yes ="y";
		String no ="n";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number ");/// to enter the number for the first time
        enteredNumber = sc.nextDouble();
        System.out.println(enteredNumber);// print the first number entered
        
        numberCount++;// count the number
        
        System.out.print("Do you want to continue y/n ");// a message to  check if next number will entered
        willtheNumberBeEntered =sc.next();// input to check if number will be entered
        while(willtheNumberBeEntered.equals(yes))
        		{System.out.print("Enter the next number ");
        		enteredNumber = sc.nextDouble();//enter the number
        		System.out.println(enteredNumber);
        		numberCount++;
        		
        		System.out.print("Do you want to continue y/n ");// a message to  check if next number will entered  inside the while loop
                willtheNumberBeEntered =sc.next();
        		if(willtheNumberBeEntered.equals(no))// if n is entered this if look will check and break the loop
        			
        		{System.out.println("count for the entered number " + numberCount); 
        			break;
        		}
         
        
	}

}}
