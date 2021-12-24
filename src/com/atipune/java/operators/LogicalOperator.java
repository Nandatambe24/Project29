package com.atipune.java.operators;

public class LogicalOperator {

	public static void main(String[] args) {
	
		//int x=5;
		int x=7;
		
		System.out.println("*********************************************");
		System.out.println("value of And"  +  (x<3 && x<10));
		System.out.println("value of Or"   +  (x<6 || x<10 ));
		System.out.println("value of Not"  + (!(x<3 && x<10)));
	
		System.out.println("*********************************************");

		System.out.println("value of And"  +  (x<4 && x<8));
		System.out.println("value of Ond"  +  (x<5 || x<7));
		System.out.println("value of Not"  +  (!(x<9 && x<5)));

	}

}
