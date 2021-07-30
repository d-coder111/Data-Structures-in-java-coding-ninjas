package WhileLoop;

import java.util.Scanner;

public class SumofEven1ToN {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 
		 int i=1,sum=0;
		 while(i<=n) {
			 if(i%2==0)
			     sum+=i;
			 i+=1;
		 }
		 System.out.println(sum);
	}

}
