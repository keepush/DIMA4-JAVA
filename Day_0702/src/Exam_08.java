/*
 * [문제-8] 마트에서 물건을 구매하였다.
 * 			물건의 총금액을 입력받고, 지불할 금액도 입력받는다.
 * 			거스름돈을 구하시오
 * 			지불할 금액이 부족하면 얼마가 부족한지 출력
 * 			
 */

import java.util.Scanner;

public class Exam_08 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int total, money, left;
		
		System.out.print("물건 총금액 입력: ");
		total = keyin.nextInt();
		System.out.print("지불할 금액 입력: ");
		money = keyin.nextInt();
		
		left = money - total;
		
		if(left >= 0) {
			System.out.printf("거스름돈은 %d원입니다.", left);
		} else {
			System.out.printf("금액이 %d원 부족합니다.", -left);
		}
		
		keyin.close();

	}

}
