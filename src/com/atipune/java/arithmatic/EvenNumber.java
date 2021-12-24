package com.atipune.java.arithmatic;

public class EvenNumber {

	public static void main(String[] args) {
		
		int a=100;
		System.out.println("List Of Even Numbers From 1 to 100"+a);
		
		for (int i = 1; i <=a; i++) {
			
			//logic is to check if no. is even or not
			//if i%2 is equal to zero,the number is even
			
			if(i%2==0)
			{
				System.out.println(i+"");
			}
			
		}

	}

}
