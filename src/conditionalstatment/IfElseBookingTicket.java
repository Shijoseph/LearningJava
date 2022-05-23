package conditionalstatment;

public class IfElseBookingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalTicket = 500;
		int bookedTicket = 500;
		
		int ticketsRequired = 300;
		
		if(ticketsRequired <= ( totalTicket - bookedTicket))
		{
			System.out.println("booking accepted ");
			
		}
		else
		{
			System.out.println("booking rejected");
		}
	}
}
