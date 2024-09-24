/*
 * 	[문제-17] 어떤 놀이동산에서 열차에 사람을 태워서 출발하려고 한다!
 * 			  무조건 5명이 채워져야 출발 가능
 * 			  그러나, 그 열차에 탈 수 있는 사람은
 *			  키가 150-180 사이여야 한다.
 *
 *	<실행>
 *		키? 151
 *		1명 탑승
 *		키? 189
 *		1명 탑승
 *		키? 145
 *		1명 탑승
 *		...
 *		키? 156
 *		5명 탑승
 *		열차 출발합니다
 */

import java.util.Scanner;

public class Exam_17 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner (System.in);
		int i = 0;    // 사람 머릿수 세는 변수
		double height;  // 키를 입력받기 위한 변수
		
		while(i < 5) {
			System.out.print("키? ");
			height = keyin.nextDouble();
			if (height >= 150 && height <= 180) {
				i += 1;
				System.out.printf("%d명 탑승", i);
				System.out.println();
			} else {
				System.out.printf("%d명 탑승", i);
				System.out.println();
			}
		}
		System.out.println("열차 출발합니다.");

		
		
		
		while (i < 5) {
		System.out.print("키? ");
		height = keyin.nextDouble();
		if (height >= 150 && height <= 180) ++i; 
		
		System.out.print(i + "명이 탑승완료!");
		}  // end while
		System.out.println("열차 출발합니다.");

}
}
