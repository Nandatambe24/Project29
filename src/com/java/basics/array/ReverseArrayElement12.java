package com.java.basics.array;

public class ReverseArrayElement12 {

	public static void main(String[] args) {
		int[] a= {40,50,30,420,530,260,100,230};
		int length=a.length;
		for(int i = 0; i < a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i = 0; i < length/2;i++)
		{
			int temp=a[i];
			a[i]=a[length-1-i];
			a[length-1-i]=temp;
		}
		{
			System.out.println("reversed array element");
			for(int i = 0; i < length;i++)
		
		{
			System.out.println(a[i]);
		}
	}

}
}