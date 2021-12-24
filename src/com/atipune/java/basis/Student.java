package com.atipune.java.basis;

public class Student {

	int stuId;
	String stuName;
	static String schoolName,schoolAddress;
	
	
	void setInstanceData(int Id,String name)
	{
		stuId=Id;
		stuName=name;
	}
	void display()
	{
		System.out.println("********************************************");
		System.out.println("stu Id="+stuId);
		System.out.println("stu name="+stuName);
		System.out.println("school name="+schoolName);
		System.out.println("school address="+schoolAddress);
		System.out.println("********************************************");
	}
	
	public static void main(String[] args) {
		System.out.println( "student 1st information");
		Student stu1=new Student();
		stu1.setInstanceData(24,"Nanda");
		
		Student.schoolName="Mahilashram Highschool";
		Student.schoolAddress="Karvenagar";
		
		stu1.display();
		
		
		
		System.out.println( "student 2nd information");
		Student stu2=new Student();
		stu2.setInstanceData(30,"Reshma");
		stu2.display();
		
		System.out.println( "student 3rd information");
		Student stu3=new Student();
		stu3.setInstanceData(24,"Mohini");
		stu3.display();

	}

}
