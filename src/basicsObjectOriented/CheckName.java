package basicsObjectOriented;

public class CheckName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = { "albin", "jei", "rijo", "jithin", "jerin", "jerin" };
		int count = 0;
		boolean ifPresent = false;
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals("jerin")) {
				ifPresent = true;

				count++;

			}

		}

		if (ifPresent) {
			System.out.println("Jerin is present in the class ");
			System.out.println("no of Jerrin's present in the class =" + count);

		} else {
			System.out.println("Jerrin is absent");
		}
	}
}
