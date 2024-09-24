/*
 * [문제] 반지름이 5인 원의 면적을 구하는 프로그램을 작성하시오
 * 원의 면적 = 파이 알 제곱
 */
public class Fifth {
	public static void main(String[] args) {
		int radius = 5;
		final double PI = 3.14159;    // 상수 변수(값이 변하지 않는 것)이므로 upper case 사용  , final 추가함으로 바꿀 수 없음
		double area = PI * radius * radius;
		
		System.out.println("반지름 5인 원의 면적은 " + area);   // 소수점을 6자리로 출력
		System.out.printf("반지름 5인 원의 면적은 %.2f%n", area);   // %n은 줄을 바꾸시오..
		System.out.println("hey");
	}
}

// 단축키
// Ctrl + S : 저장
// Ctrl + F11 :실행
// Ctrl + D : 한 줄 삭제
// Ctrl + space : 자동완성