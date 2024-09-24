/*
 * [문제-5] 이름, 국어, 영어, 수학 점수를 정수로 입력받아
 * 			합계와 평균을 구하여 출력하시오. 
 * 			평균은 소수점 이하 2자리까지 출력할 것
 */

import java.util.Scanner;

public class Exam_05 {
	String id;   // 멤버변수

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		String name;   // 지역변수
		int kor, eng, mat, all;
		double avg;
		var user = "12345";
		
		System.out.print("이름 입력: ");
		name = keyin.next();
		System.out.print("국어 점수 입력: ");
		kor = keyin.nextInt();
		System.out.print("영어 점수 입력: ");
		eng = keyin.nextInt();
		System.out.print("수학 점수 입력: ");
		mat = keyin.nextInt();
		
		all = kor + eng + mat;
		avg = all / 3.0;     // 더블 = 정수 / 정수;  <- 연산자 우선 순위 때문에 정수 중 하나는 실수여야 함   (= 프로모션)
		// avg = (double)all / 3;    (= 캐스팅) 
		
		System.out.printf("%s의 점수 총합은 %d이며, 평균은 %.2f입니다.", name, all, avg);
		keyin.close();

	}

}
