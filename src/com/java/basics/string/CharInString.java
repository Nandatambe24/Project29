package com.java.basics.string;

public class CharInString {

	public static void main(String[] args) {
     String s="Ati Pune Wagholi #M@";
     char[] a=s.toCharArray();
     for (int i=0;i<a.length-1;i++) {
    	 if (a[i]=='W')
    	 {
    		 System.out.println("true");
    		 System.out.println("char is :"+a[i] );
    	 }
		
	}

	}

}
