package com.java.basics.array;

public class IndexElement {

	public static void main(String[] args) {
		int[] a= {10,20,50,42,62,72,100};
		int SearchElement=100;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==SearchElement)
			System.out.println(" Index of serch Element"+i);
		}

	}

}
