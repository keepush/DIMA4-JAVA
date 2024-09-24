/*
 * [문제-2] 키(Height)를 지정한 후, 표준 체중을 구하시오!
 * 			남성 표준 체중 = 키(m) X 키(m) X 22
 * 			여성 표준 체중 = 키(m) X 키(m) X 21
 * 			
 * 			몸무게(Kg)를 지정한 후 BMI를 구하시오!
 * 			BMI = 몸무게(Kg) / 키(m)의 제곱
 */
public class Exam_02 {
	public static void main(String[] args) {
		// 변수를 선언하고 값을 지정  , 변수명은 무조건 소문자
		double height = 176.5;   // cm
		double stdWeight, bmi;
		double weight = 72.4;
		double temp = height / 100;  // m로 환산된 키
		
		//처리
		stdWeight = temp * temp * 22;
		bmi = weight / (temp*temp);
		
		//출력
		System.out.printf("키가 %.2fcm의 표준 체중은 %.2fKg입니다.%n", height, stdWeight);
		System.out.printf("당신의 체중은 %.2fKg이고, BMI는 %.2f입니다.%n", weight, bmi);
	}
}
