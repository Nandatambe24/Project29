package com.atipune.java.basis;

public class DataType {

	float addition(float x,int y) {
		
		return x+y;
		}
	double subtraction(double x,int y) {
		
		return x-y;
	}
	float multiplication(int x,float y) {
		
		return x*y;
		
	}
	double divide(double x,int y) {
		
		return x/y;
	}
	
	public static void main(String[] args) {
		DataType obj1=new DataType();
		float addition=obj1.addition(4.3f,30);
		double subtraction=obj1.subtraction(50,10);
		float multiplication=obj1.multiplication(25,6.6f);
		double divide=obj1.divide(90,30);
		System.out.println("Addition of two number:"+addition);
		System.out.println("Subtraction of two number:"+subtraction);
		System.out.println("Multiplication of two number:"+multiplication);
		System.out.println("Divide of two number:"+divide);
		

	}

}
