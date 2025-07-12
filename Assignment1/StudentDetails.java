package com;

class Student{
	private int rollNo;
	private int marks;
	public void setDetails(int r,int m) {
		rollNo=r;
		marks=m;
	}
	public void getDetails() {
		System.out.println(rollNo);
		System.out.println(marks);
	}
	protected char calculateGrade() {
		if(marks>=90) {
			return 'A';
		}
		else if(marks>=75) {
			return 'B';
		}
		else if(marks>=50) {
			return 'C';
		}
		else {
			return 'F';
		}
	}
}
public class StudentDetails {
	public static void main(String[] args) {
		Student s=new Student();
		s.setDetails(101, 70);
		s.getDetails();
    System.out.println( "Grade : " + s.calculateGrade());
	}
}
