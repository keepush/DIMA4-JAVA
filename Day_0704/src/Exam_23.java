/*
 * 	[문제-23] 구구단 2단에서부터 9단까지 모두 출력하시오
 * 
 * 2x1=2
 * 2x2=4
 * ..
 * 2x9=18
 * 3x1=3
 * 	
 */
public class Exam_23 {

	public static void main(String[] args) {
		for(int dan=2; dan <=9 ; ++dan) {
			for (int i=1; i<=9; ++i) {
				System.out.println(dan + "x" + i + "=" + (dan*i));
			}
			System.out.println();
		}
	}
}

