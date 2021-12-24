package com.java.basics.arrays1;

public class DuplicateElement {

	public static void main(String[] args) {
     
		int[] a= {10,20,40,12,10,20,12,56,89};
		System.out.println("common elements are");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] && i!=j) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
