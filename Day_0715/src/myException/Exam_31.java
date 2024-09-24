/*
 *  [문제-31] 정수 5개를 반복적으로 입력받아 총 합계를 구하는 프로그램을 작성하시오
 *  -- 반복문, 스캐너, 변수 2개 (합계, 입력), try~catch
 *  값 1 => 5
 *  합계 => 5
 *  값 2 => k   - 다시 받아라
 *  값 2 => ㅁ  - 다시 받
 *  값 2 => 1
 *  합계 => 6
 */

package myException;

import java.util.Scanner;

public class Exam_31 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int count=1;
		int num, sum = 0;
		
		for (int i=0; i < 5; ++i) {
			System.out.println("값 " + (i+1) + " => ");
			try {
				num = keyin.nextInt(); // 오류날 확률이 있는 코드,  오류가 난다면 이 밑의 두 줄은 생략 - catch 이동
				sum += num;
				System.out.println("합계 => " + sum);
			} catch (Exception e) {
				keyin.nextLine();   // 버퍼 안의 모든 데이터 가져옴
				--i;
				continue;
			}
		}
		
//		while (true) {
//			if (count >= 6) break;
//			System.out.print("값 " + count + " => ");
//			
//			try{ 
//				num = keyin.nextInt();
//				sum += num;
//				count++;
//				System.out.println("합계 => " + sum);
//			} catch (Exception e){
//				keyin.nextLine();   // 잘못된 입력을 버퍼에서 제거   -> 잘못된 입력이 반복적으로 처리돼 무한 루프 되는 걸 방지
//																	// -> 제거해 새로운 입력을 받을 수 있도록
//			}
//						
//		}

	}

}
