package com.java.basics.arrays1;

public class CommonElementInTwoArray {

	public static void main(String[] args) {
		int[] a= {10,50,30,11,99,55,68,75};
		int[] b= {10,20,99,75,50,45,89,78};
		
		System.out.println("common elements are");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
