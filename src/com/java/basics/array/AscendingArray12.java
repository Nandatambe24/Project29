package com.java.basics.array;

import java.util.Arrays;

public class AscendingArray12 {

	public static void main(String[] args) {
		int[] a= {20,60,40,50,70,20,78};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		Arrays.sort(a);
		System.out.println("**************************");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}

	}

}
