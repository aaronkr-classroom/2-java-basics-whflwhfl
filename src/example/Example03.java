package example;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 6;
		short s =2;
		int i = 12;
		long l = 123456789012345L;
		
		char c = 'Y';
		char c2 = 88; //ASCII 코드
		String str = "Do you like pizza?";
		
		float f =12.3456789f;
		double d = 1234567890.123456789;//d는 선택
		
		boolean bool = true; //소문자 부터 시작해야됨요
		// 출력하기
		System.out.println(str);
		System.out.println(bool);
		System.out.print(" " + c);
		System.out.println();
		System.out.println("Numbers:");
		System.out.print("\tByte:" + b);
		System.out.print("\tShort:" + s);
		System.out.print("\tInt:" + i);
		System.out.print("\tLong:" + l);
		System.out.print("\tFloat:" + f);
		System.out.print("\tDouble:" + d);
		
		System.out.println("\nChar2:" + c2);
		char c3 = 89;
		System.out.println("\nChar3:" + c3);

	}

}
