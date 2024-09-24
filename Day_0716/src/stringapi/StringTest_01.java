package stringapi;

public class StringTest_01 {

	public static void main(String[] args) {
		// String 객체 생성하는 다양한 방법
		String str1 = "Korea";
		String str2 = new String(); // 기본 생성자로 만드는 방법
		String str3 = new String("Japan");  // 

		// 기존의 데이터를 이용한 객체 생성
		char[] ch = {'오', '늘', '은','화','요','일'};
		int[] iAry = {65, 97, 66, 98, 57};
		
		String str4 = new String(ch);    // 원래 ch를 다 붙여서 하나의 문자열로 만듦
		String str5 = new String(iAry, 0, 4);   // 유니코드 값
		
		System.err.println(str4);
		System.out.println(str5);
		
		System.out.println(str1 + ", " + str2 + ", " + str3);
		
	}

}
