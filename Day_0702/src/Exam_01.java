/*
 * [문제-1] 키(Height)를 지정한 후, 표준 체중을 구하시오!
 * 			남성 표준 체중 = 키(m) X 키(m) X 22
 * 			여성 표준 체중 = 키(m) X 키(m) X 21
 */
public class Exam_01 {
	public static void main(String[] args) {
		// 변수를 선언하고 값을 지정  , 변수명은 무조건 소문자
		double height = 176.5;   // cm
		double stdWeight;
		
		double temp = height / 100;  // m로 환산된 키
		
		//처리
		stdWeight = temp * temp * 22;
		
		//출력
		System.out.printf("키가 %.2fcm의 표준 체중은 %.2fKg입니다.", height, stdWeight);
	}
}
