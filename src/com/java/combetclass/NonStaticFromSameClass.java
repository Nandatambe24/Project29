package com.java.combetclass;

public class NonStaticFromSameClass {

	int x=20,y=30;
	static int  z=50;
	
	public void instanceMethod()

	{
		System.out.println("From Same Class instance method");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		NonStaticFromSameClass obj1=new NonStaticFromSameClass();
		System.out.println("object 1 created");
		obj1.instanceMethod();
		obj1.x=150;
		obj1.y=250;
		NonStaticFromSameClass.z=400;
		obj1.instanceMethod();
		
		NonStaticFromSameClass obj2=new NonStaticFromSameClass();
		System.out.println("object 2 created");
		obj2.instanceMethod();
		obj2.x=180;
		obj2.y=320;
		NonStaticFromSameClass.z=500;
		obj2.instanceMethod();
		System.out.println("obj2 value");
		obj2.instanceMethod();
		System.out.println("obj1 value");
		obj1.instanceMethod();
		
		NonStaticFromSameClass obj3=new NonStaticFromSameClass();
		System.out.println("object 3 created");
		obj3.instanceMethod();
		obj3.x=200;
		obj3.y=350;
		obj3.instanceMethod();
		
		NonStaticFromSameClass obj4=new NonStaticFromSameClass();
		System.out.println("object 4 created");
		obj4.instanceMethod();
		obj4.x=210;
		obj4.y=420;
		obj4.instanceMethod();
		System.out.println("changed");
		NonStaticFromSameClass.z=700;
		obj4.instanceMethod();
		obj4.instanceMethod();
		
		
	}

}
