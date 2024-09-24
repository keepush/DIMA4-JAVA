/*
 * [문제-16] 키(Height)를 지정한 후, 표준 체중을 구하시오!
 * 			남성 표준 체중 = 키(m) X 키(m) X 22
 * 			여성 표준 체중 = 키(m) X 키(m) X 21
 * 			
 * 			몸무게(Kg)를 지정한 후 BMI를 구하시오!
 * 			BMI = 몸무게(Kg) / 키(m)의 제곱
 */
import java.util.Scanner;

public class Exam_16 {

	public static void main(String[] args) {
		// 변수를 선언하고 값을 지정  , 변수명은 무조건 소문자
		Scanner keyin = new Scanner(System.in);
		double height, weight, stdWeight=0, bmi;
		String gender, result;
				
		System.out.print("성별을 입력하세요(남/여): ");
		gender = keyin.next();
				
		System.out.print("키를 입력하세요(cm): ");
		height = keyin.nextDouble();
				
		System.out.print("몸무게를 입력하세요(Kg): ");
		weight = keyin.nextDouble();
				
		double temp = height / 100;  // m로 환산된 키
				
		// 남자인지 여자인지 판단해서 표준 체중을 다르게 계산해야 함
		// switch문으로 수정
		switch(gender) {
		case "남" -> stdWeight = temp * temp * 22;
		case "여" -> stdWeight = temp * temp * 21;
		default -> {
			System.out.println("성별 입력이 잘못되었습니다.");
			System.exit(0);
		}
		}

		bmi = weight / (temp*temp);
		
		// BMI 결과 처리
		if (bmi >= 39) {
			result = "고도 비만";
		} else if (bmi >= 30 && bmi <= 34.9) {
			result = "중도 비만 (2단계 비만)";
		} else if (bmi >= 25 && bmi <= 29.9) {
			result = "경도 비만 (1단계 비만)";
		} else if (bmi >= 23 && bmi <= 24.9) {
			result = "과체중";
		} else if (bmi >= 18.5 && bmi <= 22.9) {
			result  = "정상";
		} else {
			result = "저체중";
		}
		
		//출력
		System.out.printf("키가 %.2fcm의 표준 체중은 %.2fKg입니다.%n", height, stdWeight);
				
		// bmi 출력
		System.out.printf("BMI는 %.2f이고, %s입니다.", bmi, result);
				
		keyin.close();
		
	}

}
