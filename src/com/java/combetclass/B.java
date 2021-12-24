package com.java.combetclass;

public class B {

	public static void main(String[] args) {

    A obja=new A();
    obja.m1();
    obja.a=150;
    obja.b=300;
    obja.m1();
	
	A.m2();
	A.c=400;
	A.m2();
	obja.m1();
	
	System.out.println("object 2nd created");
	A obja2=new A();
	obja2.m1();
	obja2.a=200;
	obja2.b=250;
	obja2.m1();
	

	A.m2();
    A.c=3000;
    A.m2();
	obja2.m1();
	}
		
		
	}

