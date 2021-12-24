package com.java.basics.array;

public class CommonElement {

	public static void main(String[] args) {
     int[] a={10,20,40,50,30,70,11};
     int[] b={10,50,70,11,56,23,89};
     System.out.println("commomn elements are");
     
     for (int i = 0; i < a.length; i++) 
     {
    	 for (int j = 0; j < a.length; j++) 
    	 {
    		 if(a[i]==b[j])
    		 {
    			 System.out.println(+a[i]);
    		 }
			
		}
    	 
    	 
		
	}
    		 
    		 

	}

}
