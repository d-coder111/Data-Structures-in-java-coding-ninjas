package IfElse;
import java.util.Scanner;
public class LargestOf3 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		
		int a = sc.nextInt();
		int b=sc.nextInt();
		int c= sc.nextInt();
		
//		if(a>=b && a>=c) {
//			System.out.println(a);
//		}
//		else {
//			if(b>=c &&b>=a)
//				System.out.println(b);
//			else
//				System.out.println(c);
//		}
		
		
	   if(a>=b && a>=c) {
		   System.out.println("Printing A");
		   System.out.println(a);
	   }
	   else if(b>=a && b>=c) {
		   System.out.println("Printing B");
		   System.out.println(b);
	   }
	   else {
		   System.out.println("Printing C");
		   System.out.println(c);
	   }
	}

}
