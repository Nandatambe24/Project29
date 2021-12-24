package com.jatipune.java.constructor.oops;

public class ConstructorExample {

	int x;
	int y;
	float z;
	float b; 
	
	
	 ConstructorExample()
	 {
		 System.out.println("i am from default constucter");
	 }
	
	 ConstructorExample(int p,int q,float r,float s)
	 {
		 System.out.println("i am from parameterazed consrtuctor");
		x=p;
		y=q;
		z=r;
	    b=s;
	    }
		
	 void display() {
		 System.out.println("x value:"+x);
		 System.out.println("y value:"+y);
		 System.out.println("z value:"+z);
		 System.out.println("u value:"+b);
	
	 }
	 
	public static void main(String[] args) {
		ConstructorExample c1=new ConstructorExample();
		c1.display();
		
		ConstructorExample c2=new ConstructorExample(20,30,5.5f,2.3f);
		c2.display();


	
	}

}
