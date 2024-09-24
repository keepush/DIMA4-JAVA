/*
 * [문제-27] 20고개
 *  난수 1-100의 수 한 개를 발생시킨다.
 * 
 *  맞춰 보세요?  7
 *  up
 *  틀렸습니다. 맞춰 보세요? 90
 *  down
 *  틀렸습니다. 맞춰 보세요? 50
 *  up
 *  ..
 *  실패했습니다. 정답은 -입니다.
 *  정답입니다. n번만에 맞혔습니다.
 */

import java.util.Scanner;

public class Exam_27 {

	public static void main(String[] args) {
		int num, guess;
		
		Scanner keyin = new Scanner (System.in);
//		
//		num = (int)(Math.random()*100 + 1);
//		
//		System.out.print("맞춰 보세요?");
//		guess = keyin.nextInt();
//		
//		for(int i=1; i <= 4; ++i) {
//			if (guess > num){
//				System.out.println("down");
//				System.out.println("틀렸습니다. 맞춰 보세요?");
//				guess = keyin.nextInt();
//			}
//			else if (guess < num) {
//				System.out.println("up");
//				System.out.println("틀렸습니다. 맞춰 보세요?");
//				guess = keyin.nextInt();
//			}
//			else if (guess == num) {
//				System.out.printf("정답입니다. %d번 만에 맞혔습니다.", i); break;
//			}
//		}
//		System.out.printf("실패했습니다. 정답은 %d입니다.", num);
		
		
		
		// ============================== //
		int data = (int)(Math.random()*100 +1);
		int answer;
		
		System.out.println(data);
		for(int i=0; i <5; ++i) {
			System.out.print((i + 1)+ "회 입력: ");
			answer = keyin.nextInt();
			
			if (data > answer) {
				System.out.println("UP!");
			} else if(data < answer) {
				System.out.println("DOWN!");
			} else {
				System.out.println("맞혔습니다.");
				System.exit(0);
			}
			
		}
		System.out.println("못 맞혔씁니다. 정답은~" + data);
		
		
 }
}