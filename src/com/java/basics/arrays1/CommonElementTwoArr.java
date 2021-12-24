package com.java.basics.arrays1;

public class CommonElementTwoArr {

	public static void main(String[] args) {
		int[] a= {10,20,40,12,23,45,80};
		int[] b= {10,40,23,56,78,89,45};
		System.out.println("common elemenets are");
		for(int i=0;i<a.length;i++) {
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
