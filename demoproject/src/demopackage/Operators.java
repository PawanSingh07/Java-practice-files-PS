package demopackage;

public class Operators 
{
	public static void main(String[] args) {
//		Arithmetic Operators
		int Num1=1;
	    int Num2= 3;
	    int sum= Num1+Num2;
	    System.out.println(sum);
	    
	    System.out.println(Num2-Num1);
	    System.out.println(Num2*Num1);
	    System.out.println(Num2/Num1);
	    System.out.println(Num1%Num2);
	    
//	   Comparisonal operators
	    
	    System.out.println(Num2>Num1);
	    System.out.println(Num2<Num1);
	    System.out.println(Num2==Num1);
	    System.out.println(Num2>=Num1);
	    System.out.println(Num2<=Num1);
	    
//	    assignment
	    System.out.println(Num2+=Num1);
	    System.out.println(Num2-=Num1);
	    System.out.println(Num2*=Num1);
	    System.out.println(Num2/=Num1);
	    
	    
	    
//	    Logical operator
	    System.out.println(Num2>=Num1 && Num2<=Num1);
	    System.out.println(Num2>=Num1 || Num2<=Num1);
	    
//	    Unary 
	    Num2++;
	    System.out.println(Num2++);
	    System.out.println(--Num2);
	    System.out.println(++Num2);
	    System.out.println(Num2--);
	}
//       
	
}
