
public class PrintTest {
	public static void main(String[] args) {
		// System.out.print(데이터)        - 데이터(문자열, 숫자, boolean 등) 단순 출력 
		// System.out.println([데이터])    - 데이터 출력 후 줄바꿈  ,  [] = 없어도 된다
		// System.out.printf(문자열 [, 데이터])   - 데이터를 전달해 형식에 맞게 출력
		System.out.print("KITA DIMA 4기");
		System.out.println();
		System.out.println("너의 이름은 " + "홍길동, 나이는 " + 25);
		
		// printf는 형식변환문자열이 필요
		// %f - 실수, %d - 정수, %s - 문자열, %c - 문자 1개, %n - 줄바꿈, %% - % 1개
		String name = "손오공";
		
		System.out.printf("너의 이름은 %s!!!%n", name);
		System.out.printf("너의 이름은 %10s!!!%n", name);
		System.out.printf("너의 이름은 %-10s!!!%n%n", name);
		
		int value = 1234567890;
		
		System.out.printf("나의 재산은 %d원%n", value);
		
		double pi = 3.141592;
		System.out.printf("원주율은 %.2f%n", pi);
		
		char ch = '♥';
		System.out.printf("나의 마음은 %c입니다.%n", ch);
		
		double ratio = 0.95;
		System.out.printf("오늘 엔비디아 주식은 어제와 비교해서 %.2f%%%n", ratio);
	}
}
