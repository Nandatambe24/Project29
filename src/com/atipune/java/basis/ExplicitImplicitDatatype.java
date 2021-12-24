package com.atipune.java.basis;

public class ExplicitImplicitDatatype {
	
	double b=2.5;
	int a=(int)b;
	int c=100;
	double d=c;
	
	public void display()
	{
		System.out.println("value of double :" +b);
		System.out.println("convert the value");
		System.out.println("value of explicit into implicit :"+b);
		
		System.out.println("value of int :"+c);
		System.out.println("convert the value");
		System.out.println("value of implicit into explicit :"+d);
	}
	
	public static void main(String[] args) {
		ExplicitImplicitDatatype s=new  ExplicitImplicitDatatype();
		s.display();

	}

}
