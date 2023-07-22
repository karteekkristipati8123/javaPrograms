package com.oops.encapsulation;

public class Student {
	private int rollno=101;
	String sname;
	boolean isattended; 
	 public Student(int rollno) {
		 this.rollno =rollno;
	 }

	 public void setattendence(boolean flag) {
		 if(!isattended)
			 isattended = flag;
		 System.out.println("Teacher assigned attendence");
	 }
	 
	 public void getattendence() {
		 System.out.println("Teacher accessed student attendence");
		 
	 }
}
