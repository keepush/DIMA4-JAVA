// 호출 (static 메소드 안에서는 non-static을 호출 불가)

public class MethodTest_01 {

	public static void main(String[] args) {
		int a = 22;
		int b = 30;
		int test = add(a, b);					// 전달인자 (arguments)
		System.out.println(test);
		
		System.out.println(multiply(a, b));
		
		test = power(a, 3);  // a의 세제곱을 계산해서 밚환하는 메소드
		System.out.println(test);
	}
	
	// 메소드 선언 (정의) - 클래스 메소드
	public static int add(int a, int b) {	// 매개변수(parameter)
//		int a =10;							// main의 a, b와 다른 것. 이름만 우연히 같음. (다형성)
//		int b = 20;							// 지역변수는 지역 내에서만 사용 가능
		int result = a + b;
		return result;
	}
	
	public static int multiply(int a, int b) {
		return a * b;						// 메소드는 한 줄이라도 중괄호 생략 불가
	}
	
	public static int power(int a, int b) {
		int result = 1;
		for(int i=0; i < b; ++i) {
			result = result * a;
		}
		return result;
	}

}
