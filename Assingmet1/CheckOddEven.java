package com;
import java.util.Scanner;
public class CheckOddEven {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
            System.out.println("Start");
             boolean choice=true;
             while(choice) {
            	 System.out.println("1-prime,2-even,3-odd,4-exit");
            	 int x=sc.nextInt();
            	 if(x == 1) {
            		 
            		 prime();
            	 }
            	 
            	 else if(x == 2) { 
            		 even();
            		 
            	 }
            	 else if(x == 3) {
            		 odd();
            		 
            	 }
            	 else if (x == 4){
            		 System.out.println("Exit");
            		 choice=false;
            	 }
            	 else {
            	 System.out.println("PLEASE CHOOSE 1,2,3 OPTIONS FOR CONTUNING THE PROGRAM AND 4 for Stopping the process");
            	 }
            	 }
             }
	
	
	
//prime  Number checking
	
static void prime(){
	System.out.println("Enter a number to tell it  is prime or not");
	int p=sc.nextInt(),count=0;
	for (int i=1;i<=p;i++){
		      if(p%i == 0)  {
		    	  count++;
		      }
		
	}
	     if(count==2) {
	    	 System.out.println(p  +  "is prime Number");
	     }
	     else {
	    	 System.out.println(p  +  "is not prime Number");
	     }
}



//even Number checking

static void even() {
	
	System.out.println("Enter a number to tell it is  even  or not");
	int p=sc.nextInt();
	if(p % 2 == 0) {
		System.out.println(p + "It Is Even a Number");
	}
	else {
		System.out.println(p + "It is not a Even Number");
	}
}



//odd Number checking

static void odd() {
	System.out.println("Enter a number to tell it is  Odd  or not");
	int p=sc.nextInt();
	if(p % 2 != 0) {
		System.out.println(p + "IT IS  a ODD NUMBER");
	}
	else {
		System.out.println(p + "It is not  a ODD Number");
	}
}
}

