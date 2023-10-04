package Learnoops;

public class Oops {
	
}

//class Demo 
//{
//	void check(int num) {
//		if (num%2==0) {
//			System.out.println("Even Number");
//		}
//		else {
//			System.out.println("Odd Number");
//		}
//		
//	}
//	
//}
//
//
//class Test {
//	
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		d.check(12);
//	}
//	
//	
//}




//class Demo 
//{
//	int addnum (int x,int y) {
//		 
//	 return x+y;
//		
//	}
//	
//}
//
//
//class Test {
//	
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		int z= d.addnum(10,15);
//		System.out.println(z);
//	}
//	
//	
//}






//	class EFG{
//		int x=7;
//	}
//	
//	class MNO{
//		public static void main(String[] args) {
//			EFG a = new EFG();
//			int b= a.x;
//			System.out.println(b);
//		}
//	}


//	class ABC
//	{
//		void add (int a, int b) 
//		{
//			System.out.println(a+b);
//		}
//		
//	}
//	
//	class DEF{
//		public static void main(String[] args) {
//			ABC z= new ABC();
//			z.add(9, 6);
//		}
//	}

//class Demo 
//{
//	void primenum(int x) {
//		int check =0;
//	for(int i=2;i<x;i++) 
//	{
//	  if (x%i==0) 
//	  {
//		check++;
//	  }
//	  
//
//	}
//	if(check==0){
//		System.out.println("Prime Number");
//	}
//	else 
//	{
//		System.out.println("Not a Prime Number");
//	}
//}
//}
//
//
//class Test {
//	
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		 d.primenum(107027);
//		
//	}
//}

//ARMSTRONG NUMBER
//import java.util.Scanner;
//
//public class Armscheck {
//
//     void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int number = sc.nextInt();
//
//        int temp = number;
//        int digits = 0;
//        int sum = 0;
//
//        while (temp > 0) {
//            temp = temp / 10;
//            digits++;
//        }
//
//        temp = number;
//
//        while (temp > 0) {
//            int lastDigit = temp % 10;
//            sum += Math.pow(lastDigit, digits);
//            temp = temp / 10;
//        }
//
//        if (sum == number) {
//            System.out.println(number + " is an Armstrong number.");
//        } else {
//            System.out.println(number + " is not an Armstrong number.");
//        }
//    }
//}

//
//	class animal
//	{
//		void Eat()
//		{
//			System.out.println("Eat");
//		}
//		void Walk() 
//		{
//			System.out.println("Walk");
//		}
//	}
//	
//	
//	
//	class human extends animal
//	{
//		void Read()
//		{
//			System.out.println("Reading");
//		}
//		void Write()
//		{
//			System.out.println("Writing");
//		}
//	}	
//
//	class student extends human
//	{
//		void Study()
//		{
//			System.out.println("studying");
//		}
//		void work()
//		{
//			System.out.println("Working");
//		}
//		
//	}
//	
//	
//	class cat extends animal
//	{
//		void meow()
//		{
//			System.out.println("Meowing");
//		}
//		
//		void crat ()
//		{
//			System.out.println("Catching Rat");
//		}
//		
//		
//	}	
//	
//	class persian extends cat
//	{
//		void furr()
//		{
//			System.out.println("Have Furr");
//		}
//	}
	
	
//	class catobject
//	{
//		public static void main(String[] args) {
//			
//			persian p = new persian();
//				p.meow();
//				p.furr();
//				
//				
//			}
//	}
	
//	class sudentobject
//	{
//		public static void main(String[] args) {
//			student s= new student();
//			s.Read();
//		
//		}
//		
//		
//	}

//	Task 1:

//	class parent
//	{
//		void par()
//		{
//			System.out.println("This is parent class");
//		}
//		
//	}
//	
//	class child extends parent
//	{
//		void chil()
//		{
//			System.out.println("This is child class");
//		}
//		
//	}
//	
//	class object
//	{
//		public static void main(String[] args) {
//			parent p= new parent();
//			child c= new child();
//			
//			p.par();
//			c.chil();
//			c.par();
//			
//		}
//		
//	}

//task 2

//	class Vehicle
//	{
//		Vehicle()
//		{
//		  	
//		}
//		Vehicle(String make, String model , int year)
//		{
//			this.make=make;
//			this.model= model;
//			this.year = year;
//		}
//		
//		String make;
//		String model;
//		int year;
//		
//		
//		void make()
//		{
//			System.out.println(make  +" "+"make");
//			System.out.println(model +" " + "model");
//			System.out.println(year +" " + "year");
//		}
//		void model()
//		{
//			
//		}
//		void year()
//		{
//			
//		}
//	}
//	
//	class Car extends Vehicle
//	{	
//		void cm1()
//		{
//			System.out.println("This is a 4 door car");
//		}
//	}
//	
//	class Motorcycle extends Vehicle
//	{
//		void mm1()
//		{
//			System.out.println("This is a motorcycle");
//		}
//	}
//	
//	class Object
//	{
//		public static void main(String[] args) {
//			Vehicle v= new Vehicle("tata","nanao",2016);
//			Car c= new Car();
//			Motorcycle m= new Motorcycle();
//			v.make();
//			c.cm1();
//			c.make();
//			
//		}
//	}

//	task3

	

//class Z
//{
//	void show()
//	{
//		System.out.println("show is called");
//	}
//	void show(int x)
//	{
//		System.out.println(x +"is called");
//	}
//	void show(int x,int y)
//	{
//		System.out.println(x+"and"+y +"is called");
//	}
//
//	public static void main(String[] args) {
//		Z z = new Z();
//		z.show();
//		z.show(5);
//		z.show(3, 4);
//	}
//
//}
	
//	interface Government
//	{
//		int cc= 0;
//		void body();
//		void colour();
//		void airbags();
//		String Driving ="";
//		int length= 0;
//		String Model="";
//		
//			
//	}
//	
//	class Tata implements Government
//	{
//		public void body()
//		{
//			System.out.println("Metal");
//		}
//		public void colour()
//		{
//			System.out.println("Black");
//		}
//		public void airbags()
//		{
//			System.out.println("6");
//		}
//		String Driving ="Right side";
//		String length= "2 meters";
//		int cc= 3500;
//		String Model ="harrier";
//	}
//	class Test
//	{
//		public static void main(String[] args) {
//			Tata harrier= new Tata();
//			harrier.airbags();
//			harrier.body();
//			harrier.colour();
//			System.out.println(harrier.cc);
//			System.out.println(harrier.Driving);
//			System.out.println(harrier.length);
//			System.out.println(harrier.Model);
//			
//			
//		}
//	}
//	Task 1 02-10-23
//	abstract class Parent
//	{
//		abstract void message();
//		
//	}
//	
//	class subclass1 extends Parent
//	{
//		void message()
//		{
//			System.out.println("This is first subclass");
//		}
//	}
//	
//	class subclass2 extends Parent
//	{
//		void message()
//		{
//			System.out.println("This is second subclass");
//		}
//	}
//	
//	class test1
//	{
//		public static void main(String[] args) {
//			subclass1 sc1= new subclass1();
//			subclass2 sc2 = new subclass2();
//			sc1.message();
//			sc2.message();
//			
//		}
//	}
//	


//Task 2 02-10-23
// abstract class Bank
// {
//	 abstract void getbalance();
// }
// 
// class BankA extends Bank
// {
//	 void getbalance()
//	 {
//		 System.out.println("100$");
//	 }
// }
// 
// class BankB extends Bank
// {
//	 void getbalance()
//	 {
//		 System.out.println("150$");
//	 }
// }
// 
// class BankC extends Bank
// {
//	 void getbalance()
//	 {
//		 System.out.println("200$");
//	 }
// }
// 
// class test
// {
//	 public static void main(String[] args) {
//		BankA A= new BankA();
//		BankB B= new BankB();
//		BankC C= new BankC();
//		A.getbalance();
//		B.getbalance();
//		C.getbalance();
//				
//	}
// }

//Test 3
//abstract class Marks
//{
//	abstract void getPercentage();
//
//}
//
//class A extends Marks
//{	
//	A(int a, int b, int c)
//	{
//		this.num1=a;
//		this.num2=b;
//		this.num3=c;
//	}
//	int num1=0;
//	int num2=0;
//	int num3=0;
//	int x=num1+num2+num3;
//	
//	void getPercentage()
//	{
//		System.out.println(x%3);
//	}
//
//}
//
//class B extends Marks
//{	
//	B(int a, int b, int c,int d)
//	{
//		this.num1=a;
//		this.num2=b;
//		this.num3=c;
//		this.num4=d;
//	}
//	int num1=0;
//	int num2=0;
//	int num3=0;
//	int num4=0;
//	int x=num1+num2+num3+num4;
//	
//	void getPercentage()
//	{
//		System.out.println(x%4);
//	}
//
//}
//
//class test
//{
//	public static void main(String[] args) {
//		A a= new A();
//		B b= new B();
//		a.getPercentage();
//		b.getPercentage();
//	}
//	
//}


//test 4

//abstract class Task4
//{
//	Task4()
//	{
//		System.out.println("This is constructor of abstract class");
//	}
//	
//	abstract void a_method();
//	
//	void normalmet()
//	{
//		System.out.println("This is a normal method of abstract class");
//	}
//	
//
//}
//
//class SubClass extends Task4
//{
//	void a_method()
//	{
//		System.out.println( "This is an abstract method");
//	}
//}
//
//class test
//{
//	public static void main(String[] args) {
//		
//		Subclass sc= new Subclass();
//		
//		sc.a_method();
//	}
//}

//taske5
	
abstract class Animals
{
	abstract void cats()
	{
		
	}
	

}


	
	
	
	
	
	


	
	
	
	
	
