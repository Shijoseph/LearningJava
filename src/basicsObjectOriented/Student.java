package basicsObjectOriented;

public class Student {

	String studentName;
	int  sub1Marks;
	int sub2Marks;
	int sub3Marks;
	int sub4Marks;
	int sub5Marks;
	
	void Studentdetails(String name,int sub1,int sub2,int sub3,int sub4,int sub5)
	{
		studentName = name;
		sub1Marks= sub1;
		sub2Marks = sub2;
		sub3Marks =sub3;
		sub4Marks = sub4;
		sub5Marks= sub5;
	}
	
	
	double calculate()
	{
		double percentage =( (sub1Marks+sub2Marks+sub3Marks+sub4Marks+sub5Marks)*0.2);
		return percentage;
	}
}
