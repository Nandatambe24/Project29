package com.java.basics.array;

public class DublicateArrayElement {

	public static void main(String[] args) {
       int[] a= {10,20,50,42,10,60,45,42,20};
       System.out.println("Duplicate Array Element");
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]==a[j] && i!=j)
    			   System.out.println(a[j]);
    	   }
       }

	}

}
