package com.java.basics.array;

public class SumArray {

	public static void main(String[] args) {
		int[] num = new int[] {20,50,30,-60,-40,100,230};
		
		int sum = 0;
		for(int i= 0; i < num.length; i++) {
			sum = sum + num[i];
		}
			
         System.out.println("sum valve of the array element is  :" +sum);
         double average = sum/num.length;
         System.out.println("average valve of the array element is  :" +average);
	}

}
