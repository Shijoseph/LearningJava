package objectOriented;

public class Rectangle {
	
	
	int length ;
	int breadth ;
	
	
	
	int area(int lengthofRectangle,int breadthofRectangle)
	{
		length = lengthofRectangle;
		breadth =breadthofRectangle	;
		int areaOfRectangle = length*breadth;
		return areaOfRectangle;
		
		
		
		
	}

	public static void main(String[] args) {
		
		Rectangle areaOfFirstRectangle = new Rectangle();
		Rectangle areaOfSecondRectangle = new Rectangle();
		
		
				
		int lengthOfFristRectangle = 5;
		int breadthofFirstRectangle=4;
		
		int lengthofSecondRectangle = 8;
		int BreadthOfSecondRectangle = 5;
		
		System.out.println("area of first rectangle  "+areaOfFirstRectangle .area(lengthOfFristRectangle, breadthofFirstRectangle));
		System.out.println("area of second rectangle  "+areaOfSecondRectangle.area(lengthofSecondRectangle, BreadthOfSecondRectangle));
		
		
	
		// TODO Auto-generated method stub

	}

}
