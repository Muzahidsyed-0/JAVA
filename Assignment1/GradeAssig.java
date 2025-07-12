package com;

import java.util.Scanner;

public class GradeAssig {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
			int marks=sc.nextInt();
	 char  grade='x';
			if(marks>=90) {
				grade='A';
				System.out.println("A grade");
			}
			else if(marks>=75){
				grade='B';
				System.out.println("B grade");
				
			}
			else if(marks>=50){
				grade='C';
				System.out.println(" C grade");
			}	
			else if(marks<=50){
				grade='F';
				System.out.println("F grade");
			}
			else {
				System.out.println("Check the entered marks properly");
			}
			switch(grade) {
			case 'A':
				System.out.println("EXCELLENT");
				break;
	
			case 'B':
				System.out.println("GOOD");
				break;
				
			case 'C':
				System.out.println("poor");
				break;
				
				
			case 'F':
				System.out.println("Fail");
				break;
				
			default:
		 System.out.println("Grade not there");
			}
	}
	}


