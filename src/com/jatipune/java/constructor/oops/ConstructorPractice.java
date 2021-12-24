package com.jatipune.java.constructor.oops;

public class ConstructorPractice {
	
	float x;
	float y;
	float z;
	
	ConstructorPractice()
	{
		System.out.println("i am from deafault parameter");
	}
	ConstructorPractice(float a,float b,float c)
	    {
		System.out.println("i am from constucter parameter");
		
		x=a;
		y=b;
		z=c;
		}
	
	
	   void display()
	   {
		   System.out.println("x value:"+x);
		   System.out.println("y value:"+y);
		   System.out.println("z value:"+z);
	   }

	public static void main(String[] args) {
		ConstructorPractice c1=new  ConstructorPractice();
		c1.display();
		
		ConstructorPractice c2=new  ConstructorPractice(2.2f,3.2f,5.2f);
		c2.display();

	}

}
