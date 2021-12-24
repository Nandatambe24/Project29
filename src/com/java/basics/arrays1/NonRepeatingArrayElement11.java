package com.java.basics.arrays1;

public class NonRepeatingArrayElement11 {

	public static void main(String[] args) {
		int[] a= {10,20,40,10,50,40,20,33};
		int count;
		System.out.println("non repeating element");
		for(int i=0;i<a.length;i++) 
		{
			
			count=0;
			
			for(int j=0;j<a.length;j++) 
			{
				
				if(a[i]==a[j] && i!=j) {
				count++;
				}	
			if(count==0)
					System.out.println(a[i]+"  ");
				
			}
	   }


	}

}