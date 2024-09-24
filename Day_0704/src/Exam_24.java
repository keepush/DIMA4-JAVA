/*
 * 	[문제-23] 구구단 2단에서부터 9단까지 모두 출력하시오
 * 
 * 	
 */
public class Exam_24 {

	public static void main(String[] args) {

		// 개인 풀이 //
//		for (int i=1; i<=9; ++i) {
//			for(int j=2; j<=5; ++j) {
//					System.out.printf("%d x %d = %2d\t", j, i, (j*i));
//				}
//			System.out.println();	
//			}
//		
//		System.out.println();
//		
//		for (int i=1; i<=9; ++i) {
//			for(int j=6; j<=9; ++j) {
//					System.out.printf("%d x %d = %2d\t", j, i, (j*i));
//				}
//			System.out.println();	
//			}

		
		for(int i=1; i<9; i+=4) {
			for (int j=1; j<=9; ++j) {
				for (int k=i+1; k<=i+4; ++k) {
					System.out.printf("%d x %d = %2d\t", k, j, (k*j));
				}
				System.out.println();
			}
			System.out.println();
		}
		
		 
		// 교수님 풀이 //
		for(int i=2; i<10; i+=4) {
			for (int j=1; j<=9; ++j) {
				for (int dan=i; dan < i+4; ++dan) {
					System.out.printf("%d x %d = %2d\t", dan, j, (dan*j));
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
