package com.java.basics.array;

public class NonRepeatingElements11 {

	public static void main(String[] args) {
	 int[] arr= {10,2,30,10,5,40,30,2,40};
	 int count;
	 System.out.println("non repeating element in array");
	 
	 for(int i=0; i < arr.length;i++)
	 {
		 count=0;
		 
		 for(int j = 0; j < arr.length;j++)
		 {
			 if(arr[i]==arr[j] && i!=j)
				 count++;
				 
		 }
		if(count==0)
			System.out.println(arr[i]+"  ");
			
	 }
	 

	}

}
