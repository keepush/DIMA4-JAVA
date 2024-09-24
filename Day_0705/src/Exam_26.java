/*
 * [문제-26] 중복 제거 
 * 			 정수 배열 10개를 선언하고 난수 1-50까지 발생시켜 초기화한다.
 * 			 배열 안에 저장된 데이터는 중복된 값이 들어갈 수 없다.
 */

public class Exam_26 {

	public static void main(String[] args) {
		int[] num = new int[10];
		
		for(int i=0; i<num.length; ++i) {
			num[i] = (int)(Math.random()*50)+1;
			for (int j=0; j<i; ++j) {
				if (num[j] == num[i]) {
					--i;
					break;
				}
			}
		}
		
		// 출력
		for(int idx=0; idx < num.length; ++idx) {
			System.out.print(num[idx] + " ");
		}
		
		
		// ----- 교수님 풀이 ----- //
		int[] iary = new int[10];
		
		// 초기화
		for(int i=0; i<iary.length; ++i) {
			iary[i] = (int)(Math.random() * 50 + 1);   // 7
			// 중복된 데이터가 있는지 확인
			for(int j=0 ; j < i; ++j) {
				if (iary[i] == iary[j]) 
					--i;
					break;  // 5
			}
		}
		
		//출력
		for(int test : iary)
			System.out.print(test + " ");
		
		System.out.println();
		
 }
}