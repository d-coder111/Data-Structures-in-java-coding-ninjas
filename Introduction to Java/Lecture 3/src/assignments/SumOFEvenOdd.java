package assignments;

import java.util.Scanner;

public class SumOFEvenOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sumOdd=0;
		int sumEven=0,digit;
		
		while(n!=0) {
			digit=n%10;
			if(digit%2==0)
				sumEven+=digit;
			else
				sumOdd+=digit;
			
			n/=10;
		}
		System.out.println("Sum even :"+sumEven+"\n"+"Sum Odd : "+sumOdd);

	}

}
