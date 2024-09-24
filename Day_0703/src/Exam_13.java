/*
 * [문제-13] 정수를 입력받는다.
 * 			 그 정수가 홀수 / 짝수인지 판별하시오
 * 			 단, 비트연산자(&)를 사용할 것!
 * 			 
 */

import java.util.Scanner;

public class Exam_13 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int x, y, z;
//		String result;
		
		System.out.print("정수 입력: ");
		x = keyin.nextInt();
		
		y = 1;
		System.out.println(((x & y) == 0) ? "짝수" : "홀수");
		
		// 양수인지 음수인지 판별
		System.out.print("정수 입력: ");
		x = keyin.nextInt();
		
		z = 0x80000000; // 1000 0000 0000 0000 0000 0000 0000 0000
		System.out.println(((x & z) == 0) ? "양수" : "음수");
		
		keyin.close();
//		result = (y == 1) ? "홀수" : "짝수";
//		System.out.println(result);
		
	}
}