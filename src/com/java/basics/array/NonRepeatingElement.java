package com.java.basics.array;

public class NonRepeatingElement {

	public static void main(String[] args) {
	int[] a= {10,2,30,10,5,40,6,2,30,60};
	int count;
	System.out.println("Non Repeating Array Element");
	for(int i=0;i<a.length;i++)
	{
		count=0;
		for(int j=0;j<a.length;j++)
		{
			if(a[i]==a[j] && i!=j)
				count++;
		}
		if(count==0)
		System.out.println(a[i]+"  ");
	}

	}

}
