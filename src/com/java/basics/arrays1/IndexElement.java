package com.java.basics.arrays1;

public class IndexElement {

	public static void main(String[] args) {
		int[] a= {10,50,420,54,600,12};
		int SearchElement=420;
		for(int i=0;i<a.length;i++) {
			if(a[i]==SearchElement)
			System.out.println("Index of SearchElement "+i);
		}

	}

}
