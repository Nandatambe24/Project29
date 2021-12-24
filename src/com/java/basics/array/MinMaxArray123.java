package com.java.basics.array;

public class MinMaxArray123 {

	public static void main(String[] args) {
		int[] a={20,50,60,720,45,-100,-10,-200};
		int max=0,min=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
	   
		System.out.println("max value "+max);
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				min=a[i];
			}
		}
			System.out.println("min value "+min);
		}

	}


