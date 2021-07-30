package assignments;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		
		int res=1;
		
		while(n!=0) {
			res*=x;
			n-=1;
		}
		System.out.println(res);
	}

}

