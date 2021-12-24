package com.java.basics.array;

public class MinMaxArrayElement {



	public static void main(String[] args) {
		int[] a=new int[] {120,230,21,215,-16,610,-100};
		
		int max=0,min=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
	System.out.println("max value "+max);
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min) {
			min=a[i];
		}
	}
System.out.println("min value "+min);
	}
}