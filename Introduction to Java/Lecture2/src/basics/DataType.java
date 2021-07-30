package basics;

public class DataType {

	public static void main(String[] args) {
		char c='a';
//		System.out.println('a'+3);
//		System.out.println(c+3);
		
		int i=c+10;
//		System.out.println(i);
		
	//	char abc=i; will cause an error
		char abc=(char)i;
		
		long l=i;
//		i=l; will cause an error
		l=12345678910l;
		i=(int)l;
		System.out.println(l);
		System.out.println(i);
		
		double d=i;
	//	i=d; will cause an error
		
		int j=100;
		
		float f=1.23f;
		// f=d; will cause an error
		d=f;

	}

}
