package com.atipune.java.inheritance;

class Person
{
	int id;
	String name;
	Person(int id,String name){
		
    this.id=id;
    this.name=name;
	}
	void display()
	{
		System.out.println(id+"  "+name);
		}
}
	
class Employee extends Person{
	float salary;
	Employee(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
	void display1()
	{
		System.out.println(id+" "+name+" "+salary);
		}
}
		
	public class SuperBase11 
	{

	public static void main(String[] args) {
		Employee em=new Employee(1, "rani", 54215f);
		em.display1();
		
		Person p=new Person(20,"Nana");
		p.display();
	}
}	

	


