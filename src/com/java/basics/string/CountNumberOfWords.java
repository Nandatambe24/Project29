package com.java.basics.string;

import java.util.Arrays;

public class CountNumberOfWords {
	
	public static void usingSplit()
	{
		String s1="Testing Is Very Important";
		s1.trim();
		String[] words=s1.split(" ");
		System.out.println(Arrays.toString(words));
		
		System.out.println("no of words :"+words.length);
		
	}
	

	public static void main(String[] args) {
		usingSplit();
	

	}

}
