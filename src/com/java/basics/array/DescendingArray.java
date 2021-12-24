package com.java.basics.array;

import java.util.Arrays;

public class DescendingArray {

	public static void main(String[] args) {
		int[] a= {20,30,50,40,80,85};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
       Arrays.sort(a);
       System.out.println("****************");
       for (int i = 5; i>=0; i--) {
	     System.out.println(a[i]);
	}

}
}