/*
 * [문제-11] 두 과목의 점수(trade, it)와 출결 점수를 각각 입력받는다.
 * 			 출결 점수는 80점 이상, 나머지 과목의 평균은 60점 이상, 과락(40점 미만)없어야 수료한다.
 * 			 수료 여부를 출력하시오.
 * 			 삼항연산자만 사용하시오!
 */

import java.util.Scanner;

public class Exam_11 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int trade, it, attend;
		double avg;
		String result;
		
		System.out.printf("trade 점수 입력: ");
		trade = keyin.nextInt();
		System.out.printf("it 점수 입력: ");
		it = keyin.nextInt();
		System.out.printf("출석 점수 입력: ");
		attend = keyin.nextInt();
		
		avg = (trade + it + attend) / 3;
		
		result = (attend >= 80 && avg >= 60 && trade >= 40 && it >= 40) ? "수료" : "수료 불가";
		// result = (attend < 80) ? "출결 부족" : (avg < 60) ? "평균 점수 미달" : (trade < 40) ? "무역 과락" : (it < 40) ? "it 과락" : "수료";
		System.out.println(result);
		keyin.close();
		
		
	}

}
