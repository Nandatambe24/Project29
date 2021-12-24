package com.java.basics.arrays1;

import java.util.Arrays;

public class AscendingArray {

	public static void main(String[] args) {
		int[] a= {20,80,50,200,60,100};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		Arrays.sort(a);
		System.out.println("************************");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		

	}

}
