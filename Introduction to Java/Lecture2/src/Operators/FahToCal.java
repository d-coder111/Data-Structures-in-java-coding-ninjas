
package Operators;
import java.util.Scanner;

public class FahToCal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int f=s.nextInt();
		//  int cel =(5/9)*(f-32);---->wrong way
	//	int cel = (5*(f-32))/9;----->right way
		
		int cel =(int)((5.0/9)*(f-32));
		System.out.println(cel);
		
		System.out.println(9/5);
		System.out.println(9.0/5);
		
		
	}

}
