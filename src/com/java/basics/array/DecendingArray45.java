package com.java.basics.array;

import java.util.Arrays;

public class DecendingArray45 {

	public static void main(String[] args) {
		int[] a= {10,60,45,12,45,23,42};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		Arrays.sort(a);
		System.out.println("***************");
	    for (int i =6;i>=0; i--) {
	    	System.out.println(a[i]);
			
		}

	}

}
