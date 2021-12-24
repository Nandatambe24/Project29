package com.java.combetclass;

public class A {

	int a=10,b=20;
	static int c=40;
	
	public void m1()
	  {
		
		System.out.println("I am from class A instance method m1");
		System.out.println("instance value of a:"+a);
		System.out.println("instance value of b:"+b);
		System.out.println("static value of c:"+c);
	  }
	public static void m2()
	{
		System.out.println("i am from class b static method m2");
		System.out.println("static value of c"+c);
	}
	
}
