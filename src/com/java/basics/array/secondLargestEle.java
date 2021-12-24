package com.java.basics.array;

public class secondLargestEle {

	public static void main(String[] args) {
		int temp=0;
		int[] a = {30,40,80,100,200,120,451,12};
		for(int i = 0; i < a.length; i++){
			for(int j=i+1; j < a.length; j++){
				if  (a[i]>a[j]){
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			
			}
		}
		System.out.println(a[a.length-2]);

	}

}
