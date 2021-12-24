package com.java.combetclass;

public class NonStaticFromSameClass1 { 
	
	int a=30,b=40;
	static int c=60;
	
	public void instaneMethod()
	    {
		System.out.println("From same Class instance Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	
	  public static void main(String[] args) {
	  NonStaticFromSameClass1 obj2=new NonStaticFromSameClass1();
	  obj2.instaneMethod();
	  obj2.a=100;
	  obj2. b=150;
	  obj2.c=200;
	  obj2.instaneMethod();
	  NonStaticFromSameClass1 obj3=new NonStaticFromSameClass1();
	  obj3.instaneMethod();
	  obj3.a=200;
	  obj3. b=154;
	  obj3.c=300;	  
	  obj3.instaneMethod();
	  System.out.println("obj3");
	  obj3.instaneMethod();
	  System.out.println("obj2");
	  obj3.instaneMethod();
	  
	 }

}
