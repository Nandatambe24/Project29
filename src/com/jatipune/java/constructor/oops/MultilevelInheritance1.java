package com.jatipune.java.constructor.oops;

class College
{
	String collegeName="ICOER";
	String collegeLocation="Pune";
	int collegeTotalStudend=45678912;
	int collegeFees=90000;
	char naacGrade='A';
	String document="Aadarcard,LevingCertificate,CastCertificate";
	
	void c1()
	{
		System.out.println("collegeName  :"+collegeName);
		System.out.println("collegeLocation  :"+collegeLocation);
		System.out.println(" collegeTotalStudend :"+collegeTotalStudend);
		System.out.println(" collegeFees :"+collegeFees);
		System.out.println("  naacGrade:"+naacGrade);
		System.out.println(" document :"+document);
	}
}
	class Department extends College
	{
		String departmentName="Civil";
		short examFees=2000;
		short submissionFees=5000;
		byte totalStaff=50;
		byte totalSurveyInstruments=120;
		short totalCivilStudent=250;
		
		void c2()
		{
			System.out.println("departmentName :"+departmentName);
			System.out.println("examFees :"+examFees);
			System.out.println("submissionFees :"+submissionFees);
			System.out.println("totalStaff :"+totalStaff);
			System.out.println("totalSurveyInstruments :"+totalSurveyInstruments);
			System.out.println("totalCivilStudent :"+totalCivilStudent);
		}
	}
		class Student extends Department
		{
		short totalStudent=250;
		byte totalSubject=40;
		String coreSubject="CM,Survey,SOM,Design";
		
		void c3()
		{
		System.out.println("totalStudent :"+totalStudent);
		System.out.println("totalSubject :"+totalSubject);
		System.out.println("coreSubjec :"+coreSubject);
        }
			
		}
    public class MultilevelInheritance1 {

	public static void main(String[] args) {
		Department dt=new Department ();
		dt.c1();
		System.out.println("*********************************************");
		dt.c2();
		
		System.out.println("*********************************************");
		
		Student st=new Student();
		st.c1();
		System.out.println("*********************************************");
		st.c2();
		System.out.println("*********************************************");
		st.c3();
	}
	
    }
	


