package com.wipro;

public class Student extends Object{
	
	
	int  sid;
	String sname;
	
	
	public Student() {
		
		super();  // Object();
	
		System.out.println("Student object created..");
	}
	
	public Student(int sid , String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
		
		System.out.println("Student object created instance vars initialized");
	}


	
	public static void main(String[] args) {


	Student s1 =	new  Student();
	
	   System.out.println(s1);
	   
	   System.out.println(s1.sid);
	   
	   
	  Student s2 = new Student(101, "Tom"); 
	   
	   System.out.println(s2);
	   
	   System.out.println(s2.sid);
	   
	   
	   

	}

}
