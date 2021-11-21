package ch04;

public class Test {

	public static void main(String[] args) {
		
		byte bnum = -128;
		System.out.println(bnum);
	
		//int num = 12345678900;
		//long lNum = 12345678900;
		long lNum = 12345678900L;
		System.out.println(lNum);
		
		double dnum = 3.14;
		//float fnum = 3.14;
		float fnum = 3.14F;
		System.out.println(dnum);
		System.out.println(fnum);
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char ch = '\uD55C';
		
		System.out.println(ch);
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
	}

}
