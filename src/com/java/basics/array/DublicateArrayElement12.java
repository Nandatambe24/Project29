package com.java.basics.array;

public class DublicateArrayElement12 {

	public static void main(String[] args) {
		int[] a= {10,20,50,30,10,20,50,60,45};
		System.out.println("DublicateArrayElement");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j] && i!=j)
					System.out.println(a[j]);
			}
		}
		
			


	}

}

