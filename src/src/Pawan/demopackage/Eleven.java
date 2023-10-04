package demopackage;
import java.util.Scanner;
public class Eleven {
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
int number = sc.nextInt();
//	int number = 592;
	int numbera = number/100; 
//	numbera=5
//	numberaa=92, 
//	numberc=2
//	numberb=9
int numberaa= number%100;
int numberb= numberaa/10;
int numberc= numberaa%10;
//System.out.println(numberb);
System.out.println(numberc*100+numberb*10+numbera);
}
}
