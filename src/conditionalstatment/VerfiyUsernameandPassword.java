package conditionalstatment;

public class VerfiyUsernameandPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String correctUsername ="Mathew123";
		String correctPassword = "Canada@456";
		
		String enteredUsername = "Mathew123";
		String enteredPassword = "Canada@456";
		
		boolean isUsernameCorrect = enteredUsername.equals(correctUsername);
		boolean isPasswordCorrect = enteredPassword.equals(correctPassword);
		
		boolean isLoginCorrect = isUsernameCorrect && isPasswordCorrect;
		
		System.out.println("entered Username & Password match  "+isLoginCorrect);
	}

}
