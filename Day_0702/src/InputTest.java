/*
 * 키보드로 데이터를 입력받기
 * 1) Scanner 객체 선언 : System.in은 성능이 별로!
 * 	  
 * 2) 저장할 변수 선언
 * 3) 입력 메소드 이용해 입력
 * 4) 처리...
 */
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);  // import(ctrl + shift + o) 해야 함
		int age;
		double score;
		String name, gender;
		
		// next() 메소드는 Blocking 메소드이다.  (멈춰서 대기)
		System.out.print("나이 입력: ");
		age = keyin.nextInt();
		
		System.out.print("점수를 입력: ");
		score = keyin.nextDouble();
		
		System.out.print("이름 입력: ");
		name = keyin.next();    // 하나의 단어만 입력 (JamesDean, 홍길동)
		
		System.out.print("성별 입력(남/여): ");
		gender = keyin.next();
		
		System.out.println("입력한 데이터는 " + name + ", " + gender + ", " + age + ", " + score);
	}

}
