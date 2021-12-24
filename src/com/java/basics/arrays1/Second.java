package com.java.basics.arrays1;

public class Second {
	public static void main(String[] args) {
		int temp=0;
		int[] a= {10,200,50,43,450,563};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
		}	
					System.out.println(a[a.length-2]);
					
				}
			}
		
	


