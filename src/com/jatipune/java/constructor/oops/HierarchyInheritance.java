package com.jatipune.java.constructor.oops;
class Country
{
	String cName="India";
	long population=1786154755;
	long totalArea=457861231;
	String capital="Delhi";
	byte totalRiver=100;
	short longestRiverLength=1457;
	float seaShoreLength=124514.4f;
	
	void m1()
	{
		System.out.println("cName  :"+cName);
		System.out.println("population  :"+population);
		System.out.println("totalArea  :"+totalArea);
		System.out.println("capital  :"+capital);
		System.out.println("totalRiver  :"+totalRiver);
		System.out.println("longestRiverLength  :"+longestRiverLength);
		System.out.println("seaShoreLength  :"+seaShoreLength);
	}
}
class State extends Country
{
	byte cTotalState=28;
	String majorState="MP";
	String smallState="Goa";
	int longestStateLength=245172;
	short smallStateLength=4512;
	
	void m2()
	{
		System.out.println("cTotalState  :"+cTotalState);
		System.out.println(" majorState  :"+ majorState);
		System.out.println("smallState  :"+smallState);
		System.out.println("longestStateLength  :"+longestStateLength);
		System.out.println("smallStateLength :"+smallStateLength);
	}
}
class Maharashtra  extends State
{
	long totalArea=351235552;
	String capital="Mumbai";
	byte totalRiver=80;
	short longestRiverLength=4512;
	float seaShoreLength=45612.45f;
	long population=45786123;
	
	void m3()
	{
		System.out.println("totalArea  :"+totalArea);
		System.out.println("capital  :"+capital);
		System.out.println("totalRive  :"+totalRiver);
		System.out.println("longestRiverLength  :"+longestRiverLength);
		System.out.println("seaShoreLength  :"+seaShoreLength);
		System.out.println("population :"+population);
	}
}

class Kerala  extends State
{
	short totalArea=12354;
	String capital="Ranchi";
	byte totalRiver=30;
	short longestRiverLength=1245;
	float seaShoreLength=35612.45f;
	long population=3254135;
	
	void m4()
	
	{
		System.out.println("totalArea  :"+totalArea);
		System.out.println("capital  :"+capital);
		System.out.println("totalRive  :"+totalRiver);
		System.out.println("longestRiverLength  :"+longestRiverLength);
		System.out.println("seaShoreLength  :"+seaShoreLength);
		System.out.println("population :"+population);
	}
   }
	
 public class HierarchyInheritance {

	public static void main(String[] args) {
		State s=new State();
		s.m1();
		System.out.println("**************************************************");
		s.m2();
	
		Maharashtra mh=new Maharashtra();
		mh.m1();
		System.out.println("**************************************************");
	    mh.m2();
	    System.out.println("***************************************");
	    mh.m3();
		
	    System.out.println("**************************************************");
	    Kerala k=new Kerala();
	    k.m2();
	    System.out.println("**************************************************");
	    k.m4();
	    System.out.println("**************************************************");
	    k.m1();
	   
	
	}
	

}
