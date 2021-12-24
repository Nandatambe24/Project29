package com.atipune.java.inheritance;
class A1{
   int c=40;
   {
	   this.c=100;
   }
	void m1()
	{
		System.out.println("i am from me derived calass");
	}
	
}

class B1 extends A1{
	int c=4;
	static int d=60;
	B1()
	{
		this.c=50;
		this.d=500;
	}
	
	void m3()
	{
		System.out.println("i am from m3 derived calass");
	
	}
	
	void m2()
	{
		System.out.println("i am from me derived calass");
		super.m1();
		this.c=30;
		this.m3();
		System.out.println(this.d);
		System.out.println(super.c);
	}
	
}
public class Superbase {

	public static void main(String[] args) {
	B1 b=new B1();
	b.m3();
	{
		System.out.println("*******************");
	}
	b.m2();
	{
		System.out.println("******************");
	}
	A1 a=new A1();
	a.m1();

	}

}
