package com.java.basics.array;

public class CommonElementWithinTwoArray {

	public static void main(String[] args) {
	int[] a1= {10,5,4,60,40,50};
	int[] a2= {10,20,4,80,22,50};
	
	System.out.println("Coomon Elements are");
	for(int i=0;i<a1.length;i++)
	{
		for(int j=0;j<a1.length;j++)
		{
			if(a1[i]==a2[j])
				System.out.println(+a1[i]);
		}
	}


}
}