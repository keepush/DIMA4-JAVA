/*
 * 	[문제-21] 1~100 까지의 자연수 중에서 3과 5의 배수(공배수)만 출력하시오.
 * 	
 */
public class Exam_21 {

	public static void main(String[] args) {
		for (int i=1; i <=100; ++i) {
			if (!(i%3 == 0 && i%5 == 0)) continue;
			System.out.println(i);
			}
		}
	}

