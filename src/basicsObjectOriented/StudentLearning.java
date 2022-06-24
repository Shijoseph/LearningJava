package basicsObjectOriented;

public class StudentLearning {

	String nameOfStudent;
	int rollNo;
	int marks1;
	int marks2;
	
	
	
	StudentLearning(String nameOfStudent,int rollNo,int marks1,int marks2)
	{
		
		this.nameOfStudent= nameOfStudent;
		this.rollNo= rollNo;
		this.marks1= marks1;
		this.marks2= marks2;
		
		
	}
	
	
	 double getpercentage()
	 
	 {
		 return ((marks1+marks2)*0.5);
	 }
	 
	 
	void details()
	{
		System.out.println(" name of the student "+ nameOfStudent);
		System.out.println("roll number  is "+ rollNo);
		System.out.println(" marks obtained in subject 1 is "+ marks1);
		System.out.println(" marks obtained in subject 2 is "+ marks2);
	}
	}

