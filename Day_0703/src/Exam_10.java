/*
 * [문제-10] 세 자리의 정수를 입력하시오.
 * 			System.exit(1);
 * 			각 자리에 있는 DIGIT의 값을 합한 결과를 출력하시오.
 * 
 * 			예) 123  ==>  6,  999 => 27
 */

import java.util.Scanner;

public class Exam_10 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int hun, ten, one, result, num;
		
		System.out.print("정수 입력: ");
		num = keyin.nextInt();
		
		// 딱 3자리만 입력되어야 함. 아니면 종료
		// early stopping
		
		if (num > 999 || num < 100) {
            System.out.println("3자리로 입력해 주세요. 종료함");
           // return;  자신을 호출했던 쪽으로 되돌아가라
            System.exit(1);
        }
		
		// 235;
        hun = num / 100;        // 몫
        ten = (num / 10) % 10;    // num % 100 / 10;
        one = num % 10;           // num % 100 % 10;

        result = hun + ten + one;

        System.out.println(result);
        keyin.close();
		
		
	}

}
