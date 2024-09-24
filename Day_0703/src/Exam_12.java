/*
 * [문제-12] 정수 2개를 입력받는다.
 * 			 max, min 이라는 변수를 준비, 
 * 			 max에는 항상 큰 값이 들어가도록 한 후 출력하시오.
 * 			 조건) 두 값은 다른 값이 입력되도록 한다!
 */

import java.util.Scanner;

public class Exam_12 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
//		[문제 12-a]
//		int max, min, temp;
//		
//		System.out.print("값1 입력: ");
//		max = keyin.nextInt();
//		System.out.print("값2 입력: ");
//		min = keyin.nextInt();
//		
//		if (max < min) {
//			temp = max;
//			max = min;
//			min = temp;
//		}
//		
//		System.out.printf("큰 값은 %d이고, 작은 값은 %d입니다.", max, min);
		
//		[문제 12-b] 정수 3개를 입력받는다.
//		max, median, min이라는 변수를 준비,
//		max에는 항상 큰 값이 들어가도록 한 후 출력하시오.
//		조건) 두 값은 다른 값이 입력되도록 한다!
		
		int max, median, min, temp;
		
		System.out.print("값1 입력: ");
		max = keyin.nextInt();
		System.out.print("값2 입력: ");
		median = keyin.nextInt();
		System.out.print("값3 입력: ");
		min = keyin.nextInt();
		
		if (max == median || median == min || max == min) {
			System.out.println("각각 다른 값을 입력하세요");
			System.exit(1);
		}
		
		if (max < median) {
			temp = max;
			max = median;
			median = temp;
		}  // max 변수에는 median보다 큰 값이 들어감
		
		if (median < min) {
			temp = median;
			median = min;
			min = temp;
		}  // median에는 min보다 큰 값
		
		System.out.printf("큰 값은 %d이고, 중간값 %d, 작은 값은 %d%n", max, median, min);
		keyin.close();
	}

}
