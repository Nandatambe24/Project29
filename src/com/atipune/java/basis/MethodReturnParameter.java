package com.atipune.java.basis;

public class MethodReturnParameter {

	
	int addition(int x,int y,int z)
	{
		return x+y+z;
	}
	
	public static void main(String[] args) 
	{
		MethodReturnParameter obj1= new MethodReturnParameter();
		int total=obj1.addition(120,12,130);
		System.out.println("total value is"+total);
		int avg=total/2;
		System.out.println("Avg is:"+avg);

	}

}
