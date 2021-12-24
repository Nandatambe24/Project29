package com.java.basics.arrays1;

public class DecendingOrder {

	public static void main(String[] args) {
		int[] a= {10,20,100,50,75,200,12,2};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("**************");
		for(int i=7;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
