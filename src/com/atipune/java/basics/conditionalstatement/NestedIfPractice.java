package com.atipune.java.basics.conditionalstatement;

public class NestedIfPractice {

	public static void main(String[] args) {
		int age=5;
		int weight=80;
		
		if(age>=18)
		if(weight>=50)
		{
			System.out.println("you are eligible donate the blood");
		}
		else
		{
			System.out.println("you are not eligible to donate the blood");
		}
		else
		{
			System.out.println("age must be greater than 18");	
		}
		

	}

}
