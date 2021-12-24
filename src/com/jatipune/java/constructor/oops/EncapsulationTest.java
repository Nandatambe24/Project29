package com.jatipune.java.constructor.oops;
class EncasulationDemo{
	private String bankName;
    private String bankLocation;
    private int totalEmp;
    protected String document;
    private long accountNumber;
    private long balance;
    
  
    public String getBankName() {
    	return bankName;
    }

    public String getBankLocation()
    {
    	return bankLocation;
    }

    public int getTotalEmp() {
    	return totalEmp;
    }
    public String getDocument () {
    	return document;
    }
    public long getAccountNumber() {
    	return accountNumber;
    }
    public long getBalance() {
    	return balance;
    }
    public void setBankName(String a) {
	        bankName="a";
    }

    public void setBankLocation(String b) {
        bankLocation="b";
    }

    public void setTotalEmp(int c) {
        totalEmp=c;
   }  
    public void setdocument(String d) {
    	document=d;
   }
   public void setaccountNumber(long e) {
    	accountNumber=e;
   }
    public void setbalance(long f) {
         balance=f;
   }
}
   public class EncapsulationTest {

	public static void main(String[] args){
		
	    EncasulationDemo ecs=new EncasulationDemo ();
		ecs.setBankName("Hdfc");
		ecs.setBankLocation("Hydrabad");
		ecs.setTotalEmp(12345);
		ecs.setdocument("AadharCard,PanCard");
		ecs.setaccountNumber(12345123);
		ecs.setbalance(1234512l);
		
		System.out.println("BankName :" +ecs.getBankName());
		System.out.println("BankLocation :" +ecs.getBankLocation());
		System.out.println("TotalEmp :" +ecs.getTotalEmp());
		System.out.println("Document:" +ecs.getDocument());
		System.out.println("AccountNumber :" +ecs.getAccountNumber());
		System.out.println("Balance :" +ecs.getBalance());
	  
   }	
   
   } 
  
  
