/* 구구단 출력 */

import java.util.Scanner;

public class ForTest_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner (System.in);
		int dan;
		
		System.out.print("몇 단 출력할까요?");
		dan = keyin.nextInt();  // 5
		for(int i=1 ; i <=9 ; ++i)
			System.out.println(dan + "X" + i + "=" + (dan*i));
	}

}
