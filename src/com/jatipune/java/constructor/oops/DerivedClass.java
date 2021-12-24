package com.jatipune.java.constructor.oops;

 class BaseClass
{
	int x=80,y=20;
	void addition()
	{
		System.out.println("addition of x and y  :"+(x+y));
	}
	void division()
	{
		System.out.println(" divisio of x and y  :"+(x/y));
	}
	void subtraction()
	{
		System.out.println("subtraction of x and y  :"+(x-y));
	}
}

 public class DerivedClass extends BaseClass 
 {
	
	 void multiplication()
	{
		System.out.println("multiplication of x and y  :"+(x*y));
	}
	void mod()
	{
		System.out.println("mod of x and y  :"+(x%y));
	}
 
	public static void main(String[] args) {
		DerivedClass dc=new DerivedClass();
	    dc.multiplication();
		dc.mod();
		dc.addition();
		dc.division();
		dc.subtraction();
		
		
		 BaseClass b=new  BaseClass();
		 b.addition();
		 b.division();
		 b.subtraction();
	}
	}


