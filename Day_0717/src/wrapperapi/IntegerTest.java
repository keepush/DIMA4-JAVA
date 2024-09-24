package wrapperapi;

public class IntegerTest {

	public static void main(String[] args) {
		Integer i1 = 2147483647;	// int 데이터 12가 Integer로 wrap 된 것임
		i1 = i1 + 1;
//		System.out.println(i1);
//		
//		System.out.println(i1);
//		System.out.println(Integer.BYTES); // 바이트
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.SIZE); // 비트
		
		int temp = Integer.bitCount(12);    		// 0000 1100
		System.out.println(temp);
		System.out.println(Integer.bitCount(3));	// 0000 0011
		System.out.println(Integer.bitCount(10));	// 0000 1010
		System.out.println(Integer.bitCount(-1));
		
		String str = "12";
		
		// 문자열 데이터를 정수로 변환할 수 있도록 구문분석 하는 메소드
		int i2 = Integer.parseInt(str);
		System.out.println(i2 * 7);
		
		// 첫 번째 전달인자 : 숫자로 구문분석 가능한 문자열
		// 두 번째 전달인자 : 첫 번째 문자열이 몇 진수인지
		// 메소드는 숫자를 10잔수로 변환하는 메소드
		int i3 = Integer.parseInt(str, 16);  	// 16진수 12(16)  ==>  18(10)
		System.out.println(i3);
	}

}
