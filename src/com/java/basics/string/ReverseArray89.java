package com.java.basics.string;

public class ReverseArray89 {

	public static void main(String[] args) {

		
		String s="Madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		  rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	  
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("it is a palindrom");
		}else
		{
			System.out.println("not palindrom");
		}
	
	
	}
	
	
	
	
	
     
}
