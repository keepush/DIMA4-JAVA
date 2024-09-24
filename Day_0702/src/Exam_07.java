/*
 * [문제-7] 놀이동산에서 기구를 타려고 하는데 키 제한이 있다.
 * 			키가 150 ~ 180까지 탈 수 있고, 너무 작거나, 너무 큰 사람은 놀이기구를 탈 수 없다.
 * 
 * 			"즐거운 시간 보내세요."
 * 			"다른 놀이기구를 이용해 주세요."
 */

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		double height;
		
		System.out.print("키를 입력하세요: ");
		height = keyin.nextDouble();
		
		if(height >= 150 && height <= 180) {
			System.out.println("즐거운 시간 보내세요.");
		} else {
			System.out.println("다른 놀이기구를 이용해 주세요.");
		}
		
		keyin.close();

	}

}
