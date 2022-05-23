package conditionalstatment;

public class IfElseBookingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalTicket = 500;
		int bookedTicket = 22;
		
		int ticketsRequired = 1000;
		
		if(ticketsRequired < ( totalTicket - bookedTicket))
		{
			System.out.println("booking accepted ");
		}
		else
		{
			System.out.println("booking rejected");
		}
	}
}
