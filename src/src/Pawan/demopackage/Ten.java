package demopackage;

public class Ten {
//public static void main(String[] args) {
//	int a=6;
//	int b=8;
//	System.out.println("before swape with third variable");
//	System.out.println("a="+a);
//	System.out.println("b="+b);
//	int temp =a;
//     a=b;
//     b=temp;
//	System.out.println("after swape with third variable");
//	System.out.println("a="+a);
//	System.out.println("b="+b);
//	
//}
	public static void main(String[] args) {
		int a=6;
        int b=8;
        System.out.println("before swape without third variable");
    	System.out.println("a="+a);
    	System.out.println("b="+b);
    	System.out.println("after swape without third variable");
    	 a= a+b;
    	 b= a-b;
    	 a= a-b;
    	 System.out.println(a);
    	 System.out.println(b);
	}
}
