package com.arrayList;

import java.util.Comparator;

public class Student {
	
    private String studentname;
    private int rollno;
    private int studentage; 
	
	public Student(int rollno,String  studentname, int studentage) {
		super();
        this.rollno = rollno;
        this.studentname = studentname;
        this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	
	
	public static final Comparator<Student> compareByName = new Comparator<Student>(){
		public int compare(Student o1, Student o2) {
			return o1.getStudentname().compareTo(o2.getStudentname());
		}			
	};
	
	public static final Comparator<Student> compareByAge= new Comparator<Student>(){
		public int compare(Student o1, Student o2) {
			return o1.getStudentage()- o2.getStudentage();
		}			
	};
	@Override
	public String toString() {
		  return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
	}
    
    

}
