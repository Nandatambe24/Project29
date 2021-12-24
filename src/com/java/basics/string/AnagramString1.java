package com.java.basics.string;

import java.util.Arrays;

public class AnagramString1 {

	public static void main(String[] args) {
		String s1="SILENT";
		String s2="lISTEN";
		
		s1=s1.replace("  ", "");
		s2=s2.replace("  ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Strings Are Anagram");
		}
		else
		{
			System.out.println("Strings Are Not Anagram");
		}
	}

}
