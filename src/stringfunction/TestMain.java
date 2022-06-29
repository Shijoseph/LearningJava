package stringfunction;

import java.awt.image.ColorConvertOp;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test[] details = new test[3];

		test obj1 = new test("john", "Street", "HR", "HR01");
		test obj2 = new test("david", "dundas street", "Finance", "FI02");
		test obj3 = new test("rauhul", "monica ABC Street", "IT", "IT54");

		details[0] = obj1;
		details[1] = obj2;
		details[2] = obj3;

		// 1.stringvariable.length()
		System.out.println("length of the string  " + obj1.nameOfEmployee + "  = " + obj1.nameOfEmployee.length());
		System.out.println("length of the string " + obj3.officeAddress + "  = " + obj3.officeAddress.length());

		// 2.concatenation stringvariable1.concat(string variable2)

		System.out.println(obj2.nameOfEmployee.concat(obj2.employeeId));
		System.out.println(obj3.nameOfEmployee.concat(obj3.officeAddress));

		// 3. string to chararray[]--This method is used to convert all the characters
		// of a
		// string into a Character Array.
		// char[] array name = string.toCharArray();

		char[] convert = obj1.officeAddress.toCharArray();
		System.out.println(convert);

		for (int i = 0; i < convert.length; i++) {
			System.out.println(convert[i]);

		}

		// 4.String charAt()
		// This method is used to retrieve a single character from a given String
		// ‘i’ should not be negative and it should specify the location of a given
		// String i.e. if a String length is 5, then the value of ‘i’ should be less
		// than 5.
		System.out.println(obj2.officeAddress);
		System.out.println(obj2.officeAddress.charAt(0));
		System.out.println(obj2.officeAddress.charAt(1));
		System.out.println(obj2.officeAddress.charAt(6));

		// 5.String compareTo()
		// This method is used to compare two Strings. The comparison is based on
		// alphabetical order. In general terms, a String is less than the other if it
		// comes before the other in the dictionary.
		// value will be string a-string b position of the alphabets

		System.out.println(obj2.nameOfEmployee);
		System.out.println(obj3.nameOfEmployee);
		System.out.println(obj2.nameOfEmployee.compareTo(obj3.nameOfEmployee));

		System.out.println(obj3.departmentName);
		System.out.println(obj2.departmentName);

		System.out.println(obj3.departmentName.compareTo(obj2.departmentName));

		// 6.String contains()
		// This method is used to determine whether a substring is a part of the main
		// String or not. The return type is Boolean.
		// string1.contains(string2)

		System.out.println(obj3.officeAddress.contains(obj1.officeAddress));
		System.out.println(obj2.officeAddress.contains(obj3.officeAddress));

		// 7. String split
		// As the name suggests, a split() method is used to split or separate the given
		// String into multiple substrings separated by the delimiters (“”, “ ”, \\,
		// etc). In the below example, we will split the String
		// (Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp) using a chunk of String(xyz)
		// already present in the main String.

		// 8.Java String indexOf()
		// This method is used to perform a search operation for a specific character or
		// a substring on the main String. There is one more method known as
		// lastIndexOf() which is also commonly used.
		// indexOf() is used to search for the first occurrence of the character.
		// lastIndexOf() is used to search for the last occurrence of the character.

		// for charater place it inside" "
		System.out.println(obj1.officeAddress.indexOf('e'));
		System.out.println(obj2.nameOfEmployee.indexOf('d'));

		System.out.println(obj1.officeAddress.lastIndexOf('e'));
		System.out.println(obj2.nameOfEmployee.lastIndexOf('d'));

		// 9.Java String toString()
		// This method returns the String equivalent of the object that invokes it. This
		// method does not have any parameters.

		// 10.String reverse()
		// The StringBuffer reverse() method is used to reverse the input characters of
		// the String.

		// 11/String replace()
		// The replace() method is used to replace the character with the new characters
		// in a String

		// to replace one char use ' '
		// to replace string use " "

		System.out.println(obj3.nameOfEmployee.replace('u', 'o'));
		System.out.println(obj2.officeAddress.replace('d', 'o'));

		// 12.Substring Method()
		// The Substring() method is used to return the substring of the main String by
		// specifying the starting index and the last index of the substring.

		// 3 6- 4to 6 will be displayed
		// 2-5 -3 to 5 will be displayed

		System.out.println(obj1.nameOfEmployee.substring(2, 3));
		System.out.println(obj2.officeAddress.substring(3, 6));

		String[] names = { "albin", "jei", "rijo", "jithin" };

		for (int i = 0; i < names.length; i++) {
			if (names.equals("jerin")) {
				System.out.println("jerin is present in the class");
				break;
			} else {
				System.out.println("jerrin is absent");
				break;
			}

		}
	}
}
