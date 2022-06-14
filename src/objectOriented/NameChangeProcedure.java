package objectOriented;

public class NameChangeProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person neethu = new Person();
		neethu.firstName ="neethu";
		neethu.lastName="singh";
		
		System.out.println("names change process");
		System.out.println("last name prior to change   " + neethu.lastName);
	//	String updatedname = neethu.changeLastName();
		System.out.println(" last name after name change  " +neethu.firstName+ neethu.changeLastName());
	}

}
