package assignments;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
//		int i=1;
//        while(i<=n){
//            int j=1;
//            int val=i;
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
//    }
//}
	for(int i=1; i<=n; i++) {
		int val=i;
			for(int j=1; j<=i; j++) {
			    System.out.print(val);
				val=val+1;
				
		}
			System.out.println();
	}

	}

}
