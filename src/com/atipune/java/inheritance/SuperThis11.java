package com.atipune.java.inheritance;

class School
{
	String sName="BSP";
	String sLocation="Banglore";
	char sGrade='A';
	byte totalStudent=123;
	int schoolFees=12454;
	String document="AadarCard,LC";{
		
		this. m1();
	}

	void m1()
    {
	System.out.println(sName  +sLocation +sGrade +totalStudent +schoolFees 
			+document);
		
    }
}
class Student extends School
{
	int id=127;
	String mName="Ram";
	byte totalSubject=24;{
		
	super. m1();
		
	this.m2();
	}
	void m2()
	{
		System.out.println(id  +mName  +totalSubject);
	}
	
}
public class SuperThis11 {

	public static void main(String[] args) {
		 School  sc=new School();
		 sc.m1();
		 {
			 System.out.println("**************************");
		 }
		 Student  st=new Student();
		 st.m2();
	}
		

	}


