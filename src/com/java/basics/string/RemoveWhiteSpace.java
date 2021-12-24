package com.java.basics.string;

public class RemoveWhiteSpace {

	public static void removespace()
	{
	String s="java language is very important language ";
	String ns=s.replaceAll("\\s", "");
    System.out.println("old String :"+s);
    System.out.println("new string :"+ns);
    System.out.println("no of white space :"+(s.length()-ns.length()));
	}
	public static void main(String[] args) {
		removespace();
	}

	}