package com.java.basics.string;

public class CharInString11 {

	public static void main(String[] args) {
			String str="Ati Pune @*N";
			char c[]=str.toCharArray();
			for (int i = 0 ;i<c.length-1; i++) 
			{
			if (c[i]=='P') {
			System.out.println("true");
			System.out.println("char is :"+c[i]);
			}
			}
			}
			

	}


