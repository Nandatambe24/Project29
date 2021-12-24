package com.jatipune.java.constructor.oops;

public class ConsructerExample1 {
	
	String name;
	String bankName;
	long accountNo;
	long aadharNo;
	int panNo;
    int balance;
	
	ConsructerExample1()
	{
		System.out.println(" i am from default parameter");
	}
	ConsructerExample1(String name,String bankName,long accountNo,int panNo)
	{
		this.name=name;
		this.bankName=bankName;
		this.accountNo=accountNo;
		this.panNo=panNo;
	}
	ConsructerExample1(String name,long accountNo,String bankName,long aadharNo)
	{
		this.name=name;
	    this.accountNo=accountNo;
		this.bankName=bankName;
		this.aadharNo=aadharNo;
	}
	ConsructerExample1(String name,long accountNo,String bankName,int balance,int panNo)
	{
		this.name=name;
	    this.accountNo=accountNo;
		this.bankName=bankName;
		this.balance=balance;
		this.panNo=panNo;
		
	}
	void display()
	{
		System.out.println("*****************************************************************");
		System.out.println("name :" + name);
		System.out.println("bankName:"  +bankName);
		System.out.println("accountNo:"  +accountNo);
		System.out.println("aadharNo:"  +aadharNo);
		System.out.println("panNo:"  +panNo);
		System.out.println("balance:"  +balance);

		System.out.println("*****************************************************************");
	}
	public static void main(String[] args) {
		ConsructerExample1 c1=new 	ConsructerExample1();
		c1.display();
	
		ConsructerExample1 c2=new 	ConsructerExample1("nanda",13245678912l,"sbi",13457862);
		c2.display();
		
		ConsructerExample1 c3=new 	ConsructerExample1("sonam",12457896312l,"hdfc",123457896321l);
		c3.display();
		
		ConsructerExample1 c4=new 	ConsructerExample1("tanuja",12456398712l,"icici",35000,1245786);
		c4.display();

	}

}
