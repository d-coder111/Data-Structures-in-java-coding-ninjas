package assignments;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		
		for(int i =1; i<=n; i++) {
			int val=i;
			for(int space=1; space<=n-i; space++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print(val);
				val++;
			}
			System.out.println();
		}
	}

}

//import java.util.Scanner;
//public class Solution {
//
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//		
//        int i=1;
//        while(i<=n){
//            int j=1;
//            int val=i;
//            int space=1;
//            
//            while(space<=n-i){
//                System.out.print(" ");
//                space=space+1;
//            }
//            
//            
//            while(j<=i){
//                System.out.print(val);
//                val=val+1;
//                j=j+1;
//            }
//            
//            System.out.println();
//            
//            i=i+1;
//        }
//	
//
//		
//	}
//
//}
