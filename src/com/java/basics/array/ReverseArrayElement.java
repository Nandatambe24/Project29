package com.java.basics.array;

public class ReverseArrayElement {

	public static void main(String[] args) {
		int[] a= {10,50,30,40,50,80,70};
		int length=a.length;
		
		System.out.println("original array element :");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
        for(int i = 0;i < length/2;i++)
        {
        	int temp=a[i];
        	a[i]=a[length-1-i];
        	a[length-1-i]=temp;
        }
	System.out.println("reserved array elements ");
	for(int i = 0; i < length; i++)
	{
		System.out.println(a[i]);
	}
	}
	

}
