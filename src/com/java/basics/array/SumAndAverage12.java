package com.java.basics.array;

public class SumAndAverage12 {

	public static void main(String[] args) {
       
		int[] num={10,50,-16,120,-100,150,23};
		int sum =0;
		for(int i=0; i< num.length; i++)
		{
			sum = sum+num[i];
		}
           System.out.println("sum of an array vaiue :" +sum);
           double average = sum/num.length;
           System.out.println("average of an array vaiue :" +average);
	}

}
