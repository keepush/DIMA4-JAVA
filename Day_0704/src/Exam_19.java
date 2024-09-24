/*
 * 	[문제-19] 1~127까지의 코드값과 그에 해당하는 문자를 출력하시오.
 * 	
 * 		1 : x
 * 		2 : x
 * 		3 : x
 * 		...
 * 		65 : A
 * 		66 : B
 * 		...
 * 		127 : x
 */
public class Exam_19 {

	public static void main(String[] args) {
		int i=1;
		char word;
		
//		while (i<=127) {
//			word = (char)i;
//			System.out.printf("%d : %c%n", i, word);
//			++i;
//		}
		
		while (i++ < 127) {
			System.out.printf("%3d : %c%n", i, i);
		}
		
		System.out.printf("============== %d%n", (int)('\n'));    // new line
		System.out.printf("============== %d%n", (int)('\r'));    // carriage return 
		// \r\n  => 현재 라인의 맨 앞으로 가서 밑으로 내려가라
		System.out.printf("1\t2\t3");
		

	}

}
