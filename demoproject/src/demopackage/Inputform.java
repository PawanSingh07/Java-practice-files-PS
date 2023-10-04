package demopackage;
import java.util.*;
public class Inputform {
public static void main(String[] args) {
	int RightAnswer = 0;
	int WrongAnswer = 0;
Scanner sc= new Scanner(System.in);
	System.out.println("Want to participate in quiz? Enter 1");
	 int num= sc.nextInt();
if (num==1){
System.out.println("Which of the following is not a premitive datatype in java?");
System.out.println("A Integer"+ "\n"+"B Float"+ "\n"+ "C String"+ "\n"+ "D Character");
  Scanner vv= new Scanner(System.in);
  String Ans1= sc.next();
  if (Ans1== "C") {
	  RightAnswer++;
  }else{
	 WrongAnswer++; 
  }
  System.out.println("What is the output of the following code?"+ "\n" +  "A Integer X=10" + "\n"+ "B Integer Y=20");
 System.out.println("A 30"+ "\n"+"B 100"+ "\n"+ "C 20"+ "\n"+ "D None of the above");
 Scanner vs= new Scanner(System.in);
 String Ans2=sc.next();
 if (Ans2=="A") {
	 RightAnswer++;
 }else {WrongAnswer++;
 }
 System.out.println("What is the keyword used to declare a class in java?"+ "\n" +  "A Integer X=10" + "\n"+ "B Integer Y=20");
}
}
}
