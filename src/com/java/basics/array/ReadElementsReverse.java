package com.java.basics.array;

public class ReadElementsReverse {

	public static void main(String[] args) {
		int[] elements = new int[] {50,30,40,60,100,120,230,410};
		
		for(int i=elements.length-1;i>=0;i--)
		{
			System.out.println(elements[i]);
		}
		

	}

}
