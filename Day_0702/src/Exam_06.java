/*
 * [문제-6] 정수로 입력받아
 * 			짝수인지 홀수인지 판별해서 출력하시오
 */

import java.util.Scanner;

public class Exam_06 {
	String id;   // 멤버변수

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		int num;
		
		System.out.print("숫자 입력: ");
		num = keyin.nextInt();
		
		if(num % 2 == 0) {
			System.out.print("짝수입니다.");
		} else {
			System.out.print("홀수입니다.");
		}
		
		keyin.close();
	}

}
