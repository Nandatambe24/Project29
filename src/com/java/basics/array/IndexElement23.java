package com.java.basics.array;

public class IndexElement23 {

	public static void main(String[] args) {
		int[] a= {20,60,42,52,30,50};
		int SearchElement=50;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==SearchElement)
				System.out.println("index of serch element: "+i);
		}

	}

}
