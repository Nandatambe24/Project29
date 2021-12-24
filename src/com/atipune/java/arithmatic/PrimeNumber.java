package com.atipune.java.arithmatic;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=17;
		int temp=0;
		for (int i = 2; i <=a-1; i++) {
			if(a%i==0) {
				temp=temp+1;
				
			}
			
		}
		if(temp==0)
		{
			System.out.println(a+"prime no");
		}
		else
		{
			System.out.println(a+"not prime");
		}

	}

}
