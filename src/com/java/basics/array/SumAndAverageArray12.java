package com.java.basics.array;

public class SumAndAverageArray12 {

	public static void main(String[] args) {
		int[] num = {20,30,-35,50,-45,210,-12};
		int sum = 0;
		for(int x = 0; x < num.length; x++)
		{
			sum = sum + num[x];
		}
         System.out.println("sum of an array element :"+sum);
         double average = sum/num.length;
         System.out.println("average of an array element :"+average);
	}

}
