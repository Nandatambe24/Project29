package com.jatipune.java.constructor.oops;

class Mobile
{
	protected long mNo=1278125486;
	protected String name="nanda";
	
	void smsFeature()
	{
		System.out.println("i have the code to send and receive the sms");
		System.out.println("sending sms to mobile no:"+mNo+"and name also:"+name);
	}
	void callFeature()
	{
		System.out.println("i have the code make call and receive the call");
		System.out.println("calling to mobile no:"+mNo+"and name also:"+name);
	}
}
	class ThreeGMobile extends Mobile {
		
		protected long receiverNo=1274525486;
		protected String receiverName="rani";
		
		void videoCallFeature()
		{
			System.out.println("i have the code to make video calling");
			System.out.println("i am making video calling with mobile no:"+mNo+"and name also:"+name);
		}
		
	}
	class FourGMobile extends ThreeGMobile {
		
		void groupVideoCallFeature()
		{
			System.out.println("i have the code to make group video calling");
		
		}
  }
	
     class FiveGMobile extends FourGMobile {
		
		void threeDCallFeature()
		{
			System.out.println("i have the code to make three d calling");
		
		}
  }
	
	public class MultiLevelInheritance {

	public static void main(String[] args) {
		 FourGMobile g4=new  FourGMobile();
		 g4.smsFeature();
		 g4.callFeature();
		 g4.videoCallFeature();
		 g4.groupVideoCallFeature();
		 
		 FiveGMobile g5=new  FiveGMobile();
		 g5.smsFeature();
		 g5.callFeature();
		 g5.videoCallFeature();
		 g5.groupVideoCallFeature();
	     g5.threeDCallFeature();
	

	}

	}
