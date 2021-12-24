package com.java.basics.arrays1;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] a= {20,30,40,50,10,48,75,89};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
			System.out.println("sum"+sum);
			double Average=sum/a.length;
			System.out.println("average "+Average);
			
		}
		}
         
	


