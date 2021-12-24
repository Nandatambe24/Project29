package com.atipune.java.arithmatic;

public class PrimeNo {

	public static void main(String[] args) {
		
	
		for(int a=1;a<=100;a++) {
			int temp=0;
			for (int i= 2; i<=a-1; i++) {
				if(a%i==0) {
					temp=temp+1;
				}
				
			}
			if(temp==0) {
				System.out.println(a);
			}
		
		}

	}

}
