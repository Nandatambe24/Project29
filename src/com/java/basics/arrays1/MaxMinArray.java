package com.java.basics.arrays1;

public class MaxMinArray {

	public static void main(String[] args) {
	 int[] a= {10,20,50,40,60,-11,-450};
	 int min=0,max=0;
	 for(int i=0;i<a.length;i++) {
		 if(a[i]>max) {
			 max=a[i];
		 }
	 }
			 
			System.out.println("max value "+max); 
			 for(int i1=0;i1<a.length;i1++) {
				 if(a[i1]<min) {
					 min=a[i1];
				 }
			 }
					 System.out.println("min value"+min);
					 
				 }
			 }
		 
	 

	


