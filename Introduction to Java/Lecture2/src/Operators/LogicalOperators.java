package Operators;
import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		boolean isALargest = (a >= b) && (a >= c);
		System.out.println(isALargest);
		System.out.println((a >= b) || (a >= c));
		System.out.println(!(a>=b));
	}

}
