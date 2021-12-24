package com.atipune.java.basis;

public class DataTypeByte {

	 
   
	
	byte b1=127;
	byte b2=-128;
	byte b3=(byte)-129;
	byte b4=(byte)130;
	byte b5=124;
	byte b6=-125;
	
	public void display()
	{
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
   }	
		public static void main(String[] args)
		{
			DataTypeByte db=new DataTypeByte();
			db.display();
		}
	
	

}
