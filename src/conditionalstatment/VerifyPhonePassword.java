package conditionalstatment;

public class VerifyPhonePassword {

	public static void main(String[] args) {
		// to verify if entered phone password is correct
		
		int correctPassword = 4562;
		int enteredPassword1 = 4561;
		int enteredPassword2 = 4562;
		
		boolean firstAttempt = enteredPassword1 == correctPassword ;
		boolean secondAttempt = enteredPassword2 == correctPassword;
		
		System.out.println(" value of the first password entered is    " + firstAttempt);
		System.out.println("value of the second password entered is   "+ secondAttempt);
	}

}
