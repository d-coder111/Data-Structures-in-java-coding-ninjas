package assignments;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int basic=sc.nextInt();
        String grade=sc.next().toUpperCase();
        char c=grade.charAt(0);
        
        double hra=0.2*basic;
        double da=0.5*basic;
        double pf=.11*basic;
        int allow=0;
        
        if(c=='A')
            allow=1700;
        else if(c=='B')
            allow=1500;
        else
            allow=1300;
        
         int totalSalary=(int)(Math.round(basic+hra+da+allow-pf));
         System.out.println(totalSalary);
        

	}
}

//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//    int basic=sc.nextInt();
//    String grade=sc.next().toUpperCase();
//    char c=grade.charAt(0);
//    
//    double hra=0.2*basic;
//    double da=0.5*basic;
//    double pf=.11*basic;
//    int allow=0;
//    
//    if(c=='A')
//        allow=1700;
//    else if(c=='B')
//        allow=1500;
//    else
//        allow=1300;
//    
//     int totalSalary=(int)(Math.round(basic+hra+da+allow-pf));
//     System.out.println(totalSalary);
//    
//
//}
//}

