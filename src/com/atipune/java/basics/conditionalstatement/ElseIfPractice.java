package com.atipune.java.basics.conditionalstatement;

public class ElseIfPractice {

	public static void main(String[] args) {
		
		int marks=80;
		if(marks<35)
		{
			System.out.println("fail");
		}
		else if(marks<40)
		{
			System.out.println("D grade");
		}
	
		else if(marks<50)
		{
			System.out.println("C grade");
		}
	
	
		else if(marks<60)
		{
			System.out.println("B grade");
		}
	    else if(marks>70)
		{
			System.out.println("A grade");
		}
	    else if(marks>82)
		{
			System.out.println("A+ grade");
		}
	
	    else
	    {
	    	System.out.println("invalid"); 
	    }
	
	}
   }
