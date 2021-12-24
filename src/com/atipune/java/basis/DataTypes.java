package com.atipune.java.basis;

public class DataTypes {

	double addition(float x,double y) {
		
		return x+y;
	}
	float subtraction(int x,float y) {
		
		return x-y;
	}
	float multiplication(int x,float y) {
		
		return x*y;
		
	}	
	
	double divide(double x,int y) {
		
		return x/y;
	}
	
	
	public static void main(String[] args) {
		
		DataTypes obj1=new DataTypes();
		double addition=obj1.addition(5.3f,55);
		System.out.println("Addition of two number:"+addition);
		float subtraction=obj1.subtraction(25, 6.5f);
		System.out.println("Subtraction of two number:"+subtraction);
		float multiplication=obj1.multiplication(40, 2.5f);
		System.out.println("multiplication of two number:"+multiplication);
		double divide=obj1.divide(100, 20);
		System.out.println("divide of two number:"+divide);
	

	}

}
