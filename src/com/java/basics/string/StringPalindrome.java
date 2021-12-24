package com.java.basics.string;

public class StringPalindrome {

	public static void main(String[] args) {
		String s="MADAM";
		String rev="";
		for (int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
       if(s.equals(rev))
       {
    	   System.out.println("Palindrome String");
       }
       else
       {
    	  System.out.println("Not A Palindrome Sting");
       }
    	   
	}

}
