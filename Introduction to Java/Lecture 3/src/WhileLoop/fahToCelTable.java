package WhileLoop;

import java.util.Scanner;

public class fahToCelTable {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int S=sc.nextInt();
		int E=sc.nextInt();
		int W=sc.nextInt();
		
		while(S<=E) {
			
			int c=(int)((5.0/9)*(S-32));
			System.out.println(S+"\t"+c);
			S+=W;
			
		}

	}

}
