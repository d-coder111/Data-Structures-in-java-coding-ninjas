package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int val=1;
		int i=1;
		while(i<=n) {
			int space=1;
			while(space<=n-i) {
				System.out.print(" ");
				space++;
			}
			
			
			int j=1;
			while(j<=i) {
				System.out.print(val);
				val++;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
