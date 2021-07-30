package UserInput;

import java.util.Scanner;



public class SiCalculatorUserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		System.out.println(str);
		char c=str.charAt(0);
		
		String str1=sc.next();
		System.out.println(str1);
	
		
		int p=sc.nextInt();
		int r=sc.nextInt();

		int t=sc.nextInt();

		int si=(p*r*t)/100;
		
		long l=sc.nextLong();
		double d=sc.nextDouble();
		float f= sc.nextFloat();
		
	
		System.out.println(si);
		
		


	}

}
