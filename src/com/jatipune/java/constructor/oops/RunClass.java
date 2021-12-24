package com.jatipune.java.constructor.oops;

class Encapsulation {
	 private int age;
	 void setAge(int a)
	 {
		 if(a>=0)
		 {
			 age=a;
		 }
		 else
		 {
			 age=0;
		 }
	 }
		 int getAge()
		 {
			 return this.age;
		 }
	 }
	 public class RunClass{

	public static void main(String[] args) {
		Encapsulation e=new  Encapsulation();
		e.setAge(50);
        int getAgeValue=e.getAge();
		System.out.println("age  :"+getAgeValue);
		
		
	}
		

	}


