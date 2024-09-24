/*
 * static 키워드
 * 클래스 변수 선언 시 사용
 * 클래스 변수는 객체의 생성 없이 접근 가능
 * 
 * 멤버변수 앞,
 * 멤버 메소드 앞,
 * 내부 클래스 앞에 static 키워드를 붙여 클래스 변수, 클래스 메소드, static 클래스로 작성하여 사용
 * 
 * final 키워드 : 
 * 	지역변수 앞		- 값 수정 불가. 선언하면서 값을 초기화해야한다!
 *  멤버 변수 앞	- 값 수정 불가. 선언하면서 값을 초기화해야한다!
 *  멤버 메소드 앞	- 오버라이딩 불가
 *  클래스 앞 		- 상속 불가
 */


import java.util.Scanner;


public class FinalTest {
	String str1;		// 멤버변수 -- null 자동 초기화
	static String str2;	// 클래스   -- null 자동 초기화
	final String str3 = "강";	//값을 수정할수x 멤버변수라 미리부터 넣어놔야함
	static final String MY_DATA = "데이터" ; //변경불가 = 올대문자에띄어쓰기언더바해야됨

		public static void main(String[] args) {
			int a;
			a = 10;
			a = 25;		// 대입 가능
			final int b = 23;
//			b = 14; 	// 값이 이미 초기화 됐으므로 대입 불가
			
			System.out.println(a);
			System.out.println(FinalTest.str2); //str1은 non-static
			System.out.println(b);

		}

	}
