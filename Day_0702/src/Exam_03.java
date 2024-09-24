/*
 * [문제-3] 키(Height)를 지정한 후, 표준 체중을 구하시오!
 * 			남성 표준 체중 = 키(m) X 키(m) X 22
 * 			여성 표준 체중 = 키(m) X 키(m) X 21
 * 			
 * 			몸무게(Kg)를 지정한 후 BMI를 구하시오!
 * 			BMI = 몸무게(Kg) / 키(m)의 제곱
 */

import java.util.Scanner;

public class Exam_03 {
	public static void main(String[] args) {
		// 변수를 선언하고 값을 지정  , 변수명은 무조건 소문자
		Scanner keyin = new Scanner(System.in);
		double height, weight, stdWeight, bmi;
		String gender;
		
		System.out.print("성별을 입력하세요(남/여): ");
		gender = keyin.next();
		
		System.out.print("키를 입력하세요(cm): ");
		height = keyin.nextDouble();
		
		System.out.print("몸무게를 입력하세요(Kg): ");
		weight = keyin.nextDouble();
		
		double temp = height / 100;  // m로 환산된 키
		
		// 남자인지 여자인지 판단해서 표준 체중을 다르게 계산해야 함
		if(gender.equals("남")) {   // 기본자료형만 ==으로 비교, 객체 타입(참조형)은 equals로만 비교
			stdWeight = temp * temp * 22;
		} else {
			stdWeight = temp * temp * 21;
		}
		
		//처리
		bmi = weight / (temp*temp);
		
		//출력
		System.out.printf("키가 %.2fcm의 표준 체중은 %.2fKg입니다.%n", height, stdWeight);
		
		// bmi 출력
		System.out.printf("BMI는 %.2f입니다.%n", bmi);
		
		keyin.close();
	}
}
