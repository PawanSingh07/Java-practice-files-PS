package demopackage;

import java.util.Scanner;

//import java.util.Scanner;

public class Dowhilepractice {
public static void main(String[] args) {
//	Q1 write a do while loop that prints the number from 1 to 10
//	int num=1;
//	do {
//		System.out.println(num);
//	    num++;
//	    }
//	while (num<11);
	
	
// Q2 
//	Scanner sc= new Scanner(System.in);
//	int number;
//	do
//	{
//		System.out.println("Enter a number");
//		number= sc.nextInt();
//	}
//	
//	while (number<0);
//	System.out.println("Done");
//	

//	Q3
//	int number=1;
//	do 
//	{
//		if(number%2==0)
//		{
//			System.out.println(number);
//		}
//		number++;
//	}
//	while (number<100);

//	Q4
//	int a= 0;
//	int b= 1;
//	int c= a+b; 
//	
//	System.out.println(a );
//	System.out.println(b);
//	
//	do 
//	{ 
//		System.out.print(a+b);
//	a=b;
//	b=c;
//	c=a+b;
//	}
//	
//	while (a<100);
//		
	
//	Q4
	Scanner sc= new Scanner(System.in);
    String abc;
	String password = "abc";
	do
	{
		if ( password!="abc")
		{
		System.out.println("Enter the password");
		password= sc.next();
		}
	}
	
	while (password=="abc");
	System.out.println("Correct");
		

	
	}
}

