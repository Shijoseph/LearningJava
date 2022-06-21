package objectOriented;

public class Rectangle {

	int area(int lengthofRectangle, int breadthofRectangle) {

		return lengthofRectangle * breadthofRectangle;

	}

	public static void main(String[] args) {

		Rectangle areaOfFirstRectangle = new Rectangle();
		Rectangle areaOfSecondRectangle = new Rectangle();

		System.out.println("area of first rectangle  " + areaOfFirstRectangle.area(4, 5));
		System.out.println("area of second rectangle  " + areaOfSecondRectangle.area(5, 8));

		// TODO Auto-generated method stub

	}

}
