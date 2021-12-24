package com.java.basics.array;

public class IndexElement112 {

	public static void main(String[] args) {
		int[] a= {10,20,50,40,60,70,200};
		int SearchElement=70;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==SearchElement)
			System.out.println("Index Of Search Element :"+i);
			
		}

	}

}
