package stringfunction;

public class TypesOfStringMethods {

	public static void main(String[] args) {

		String a = "my abme is John Honai";
		String b = " Welcome to Ooty ,nice to meet you";
		String c = "kindly read the book carefully, the book contains all details on Java";

		String[] names = new String[5];
		names[0] = "alpha";
		names[1] = "beta";
		names[2] = "gamma";
		names[3] = "beta";
		names[4] = "Alpha";

		// String[] names = {"alpha","beta","gamma","beta","Alpha"};

		// CharAt()
		System.out.println(a.charAt(5));
		System.out.println(names[3].charAt(1));

		// codePointAt() & codePointBefore()

		System.out.println(a.codePointAt(4));
		System.out.println(a.codePointBefore(4));
		
		//compareTo()
		System.out.println(names[0].compareTo(names[1]));
		System.out.println(names[0].compareToIgnoreCase(names[2]));
		System.out.println(names[0].replace('a', 'x'));
		System.out.println(a.replace('i', 'x'));
	

	}

}
