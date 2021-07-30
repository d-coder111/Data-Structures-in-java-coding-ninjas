package IfElse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n =sc.nextInt();
		
		if(n%2==0) {
			System.out.println("Even number");
			return;
		}
	
			System.out.println("Odd number");
	}

}
