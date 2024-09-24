package mybuffer;

import java.util.Scanner;

public class InputBuffer {
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String name, addr;
		int a;
		double b;
		
		System.out.print("이름: ");
		name = keyin.nextLine();
		System.out.println("입력된 이름: " + name + "\n");
		
		keyin.nextLine();    // nextLine을 사이에 넣으려면 그 중간에 아무것도 넣지 않은 nextLine 삽입 필요
		
		System.out.print("주소:  ");
		addr = keyin.nextLine();          // 입력버퍼를 청소 ==> 문장 전체를 다 가져옴
		System.out.println("입력된 주소: " + addr + "\n");
		
		System.out.print("정수 입력: ");
		a = keyin.nextInt();
		System.out.println("입력된 정수값: " + a + "\n");
		
		
		System.out.print("실수 입력: ");
		b = keyin.nextDouble();
		System.out.println("입력된 실수값: " + b + "\n");
		
	}
}
