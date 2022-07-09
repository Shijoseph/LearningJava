package encapsulation;
import java.util.Random;
public class ProductMain {
	
	
	//public static void main (String[]args)
	//{System.out.println(sb.toString());
		
	//}
	public static String generateRandomPassword(int len) {
		String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
          +"jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		return sb.toString();
	}

	{
	
	
	}
	}

	
	

