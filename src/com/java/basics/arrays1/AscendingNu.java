package com.java.basics.arrays1;

import java.util.Arrays;

public class AscendingNu {

	public static void main(String[] args) {
		int[] a= {20,40,10,50,12,23,70,45,56};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("**************************");
         Arrays.sort(a);
         for(int i=0;i<a.length;i++) {
        	 System.out.println(a[i]);
         }
	}

}
