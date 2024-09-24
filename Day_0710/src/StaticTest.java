/*
 *  원의 반지름을 입력하여 원의 면적을 구하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class StaticTest {

	public static void main(String[] args) {
		
		Scanner keyin = new Scanner(System.in);
		
		// public static final double PI == static + final 이면 대문자로 써야한대
		System.out.println("반지름 얼마?: ");
		int halfLength = keyin.nextInt();
		
		double PI = (halfLength * halfLength * Math.PI);
		
		// public static PrintStream out;
		System.out.printf("반지름 %dcm의 원의 면적은 %.4fcm^2입니다", halfLength, PI);

	}

}
