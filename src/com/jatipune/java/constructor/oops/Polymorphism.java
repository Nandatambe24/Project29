package com.jatipune.java.constructor.oops;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism  ps=new 	Polymorphism();
		ps.addition(100, 200);
		System.out.println(ps.addition(152.55, 45, 450));
		System.out.println(ps.addition(45.5f, 124, 450));

	}


   void addition(int a,int b) {
	System.out.println("addition of a and b :" +a+b);
  }
   double addition(double a,int b,int c) {
            return(a+b+c);
  }
  float addition(float f,int a,int b) {
	   return(f+a+b);
  }
}