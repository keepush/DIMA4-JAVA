import java.util.Scanner;

public class OperatorTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		int val;
		
		System.out.print("숫자를 입력: ");
		val = keyin.nextInt();
		
		if(val == 0) {
			System.out.println("영입니다.");
		} else if (val < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("양수입니다.");
		}

	}

}
