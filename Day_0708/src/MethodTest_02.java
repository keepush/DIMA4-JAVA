/*
 *  정수값을 입력받아 그 정수가 소수인지 판단하는 메소드를 작성하시오
 *  소수이면 true, 아니면 false 반환
 *  
 *  소수란? 1과 자기 자신 이외에는 나누어 떨어지지 않는 수
 *  
 *  public static boolean isPrimeNumber(int);
 *  
 *  	<실행>
 *  	수를 입력:  9
 *  	9는 소수가 아닙니다.
 *  
 *  	수를 입력: 7
 *  	7은 소수입니다.
 */

import java.util.Scanner;

public class MethodTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int a;
		
		System.out.print("수를 입력: ");
		a = keyin.nextInt();
		
		boolean result = isPrimeNumber(a);
		System.out.println(a + "는 " + ((result)? "소수입니다. ": "소수가 아닙니다."));
		
//		if (isPrimeNumber(a)) {
//			System.out.print(a +"은 소수입니다.");
//		} else {
//			System.out.print(a + "은 소수가 아닙니다.");
//		}
		keyin.close();
		
	}
	
	public static boolean isPrimeNumber(int a) {
		for (int i=2; i<a; ++i) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;
}
	
	
//	public static boolean isPrimeNumber(int n) {  // 2 ~ n-1
//		boolean result = false;
//		
//		for(int i=2; i < n; ++i) {  // n=9라면
//			if(n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//	}

	public static boolean isEven(int a) {
		if (!(a % 2 == 0)) {
			return false;
		}
		return true;
	}
	
}