/*
 * [문제-4] 성별, 키(cm)와 몸무게(kg)를 키보드로 입력받아 표준체중을 구하시오
 * 			BMI와 비만도를 구하시오!
 * 			남성 표준 체중 = 키(m) X 키(m) X 22
 * 			여성 표준 체중 = 키(m) X 키(m) X 21
 * 			
 * 			BMI = 몸무게(Kg) / 키(m)의 제곱
 * 			비만도(%) = 실체중 / 표준체중 * 100 (표준체중 대비 실체중 비율) - fatRatio
 */

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		// 변수 선언
		Scanner keyin = new Scanner(System.in);
		double height, weight, stdWeight, bmi, fatRatio;
		String gender;
		
		
		// 입력
		System.out.print("성별을 입력하세요(남/여): ");
		gender = keyin.next();
		
		System.out.print("키를 입력하세요(cm): ");
		height = keyin.nextDouble();
		
		System.out.print("몸무게를 입력하세요(Kg): ");
		weight = keyin.nextDouble();
		
		double temp = height / 100;  // m로 환산된 키
		
		
		
		// 처리
		if(gender.equals("남")) {   // 기본자료형만 ==으로 비교, 객체 타입(참조형)은 equals로만 비교
			stdWeight = temp * temp * 22;
		} else {
			stdWeight = temp * temp * 21;
		}
		
		bmi = weight / (temp*temp);
		fatRatio = weight / stdWeight * 100;
		
		
		// 출력
		System.out.printf("키가 %.2fcm의 표준 체중은 %.2fKg입니다.%n", height, stdWeight);
		System.out.printf("BMI는 %.2f입니다.%n", bmi);
		System.out.printf("비만도는 %.2f%%입니다.%n", fatRatio);
		
		keyin.close();
	}
}
