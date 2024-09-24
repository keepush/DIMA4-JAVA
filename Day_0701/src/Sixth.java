/*
 * [문제]
 * 	키(cm), 몸무게(Kg)를 설정한 후 BMI(체질량 지수)를 구하여 출력하시오.
 * "당신의 키 174cm, 몸무게 67Kg은 BMI XX.XX 입니다.
 * BMI = 몸무게(kg) / 키(m)의 제곱
 */
public class Sixth {
	public static void main(String[] args) {
		double height = 189;
		double meter = height / 100;  // 키를 m로 환산
		double weight = 67.3;
		
		double bmi = weight / (meter * meter);
		
		System.out.printf("키 %.0fcm, 몸무게 %.0fKg은 BMI %.2f 입니다.", height, weight, bmi);
	}
}
