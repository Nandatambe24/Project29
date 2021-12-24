package com.java.basics.string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AnagramString45 {

	public static void main(String[] args) {
     
		String x="LISTEN";
		String y="SILENT";
		
		char[] a=x.toCharArray();
		char[] b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result= Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("String are anagram");
			
		}else
		{
			System.out.println("Strings are not anagram");
		}
	}

}
