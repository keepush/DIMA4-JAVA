/*
 * [문제-14] 정수를 입력받는다.
 * 			 그 정수의 모든 비트를 출력하시오.
 * 			 단, 비트연산자(&, >>>)를 사용할 것!
 * 
 * 			 12를 입력
 * 			 출력 결과
 * 			 0000 0000 0000 0000 0000 0000 0000 1100
 * 			 
 */


import java.util.Scanner;

public class Exam_14 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		int x, y, z;
		y = 0x80000000;
		
		System.out.print("정수 입력: ");
		x = keyin.nextInt();
		
		for(int i=1; i<=32 ; ++i) {
			System.out.print(((x&y) != 0) ? 1 : 0);
			y = y >>> 1;
			// y = 0x80000000 >>> i-1;
			if (i % 4 ==0) {
				System.out.print(" ");
			}
		}
		keyin.close();
		
	}
}