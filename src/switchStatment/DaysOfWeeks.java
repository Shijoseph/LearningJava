package switchStatment;

import java.util.Scanner;

public class DaysOfWeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String enteredDay = "";
		System.out.println("enter the day  ");
		Scanner sc = new Scanner(System.in);

		enteredDay = sc.next();

		switch (enteredDay)

		{
		case "monday": {
			System.out.println("Monday is the first day of the week");
			break;
		}

		case "tuesday": {
			System.out.println("tuesday is the second day of the week");
			break;
		}

		case "wednesday": {
			System.out.println("wednesday is the third day of the week");
			break;
		}

		case "thursday": {
			System.out.println("thursday is the fourth day of the week");
			break;
		}

		case "friday": {
			System.out.println("friday is the fifth day of the week");
			break;
		}

		case "saturday": {
			System.out.println("saturday is the sixth day of the week");
			break;
		}

		case "sunday": {
			System.out.println("sunday is the seventh day of the week");
			break;
		}

		default: {
			System.out.println("enter a valid day");
		
		}
		}
	}
}