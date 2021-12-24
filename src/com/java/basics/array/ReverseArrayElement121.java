package com.java.basics.array;

public class ReverseArrayElement121 {

	public static void main(String[] args) {
       int[] a= {10,20,50,40,60,30,45,12};
       int length=a.length;
       System.out.println("original array elements");
       for(int i=0;i<length;i++)
       {
    	   System.out.println(a[i]);
       }
       for(int i=0;i<length/2;i++)
       {
    	   int temp=a[i];
    	   a[i]=a[length-1-i];
    	   a[length-1-i]=a[i];
    	   }
       System.out.println("reverse array element");
       for(int i=0;i<length;i++)
       {
    	   System.out.println(a[i]);
       }
	}

}
