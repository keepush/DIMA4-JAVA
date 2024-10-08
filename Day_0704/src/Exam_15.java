/*
 * [문제-15]
 *	숫자1 : 50
 *	숫자2 : 40
 *	
 *	1) 덧셈  2) 뺄셈  3) 곱셈  4) 나눗셈 --> 3
 *	곱셈의 결과는 2000
 *	
 * */
import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner (System.in);
		double num1, num2, result;
		int choice;
		
		System.out.print("숫자 입력1: ");
		num1 = keyin.nextDouble();
		System.out.print("숫자 입력2: ");
		num2 = keyin.nextDouble();
		System.out.print("1) 덧셈  2) 뺄셈  3) 곱셈  4) 나눗셈 --> ");
		choice = keyin.nextInt();
		
//		switch(choice) {
//		case 1 : System.out.printf("덧셈 결과는 %.0f입니다.", num1+num2); break;
//		case 2 : System.out.printf("뺠셈 결과는 %.0f입니다.", num1-num2); break;
//		case 3 : System.out.printf("곱셈 결과는 %.0f입니다.",  num1*num2); break;
//		case 4 : System.out.printf("나눗셈 결과는 %.2f입니다.", num1/num2); break;
//		default : System.out.println("범위 내 숫자만 입력해 주세요.");
//		}
		
//		switch(choice) {
//		case 1 : result = num1 + num2; break;
//		case 2: result = num1 - num2; break;
//		case 3: result = num1 * num2; break;
//		case 4: result = num1/num2: break;
//		default : {
//			System.out.println("키 입력이 잘못되었습니다.");
//			System.exit(0);
//		}
//		}
		
		// switch문 (2)
//		switch(choice) {
//		case 1 -> result = num1 + num2;
//		case 2 -> result = num1 - num2;
//		case 3 -> result = num1 * num2;
//		case 4 -> result = num1 / num2;
//		default -> {
//			System.out.println("키 입력이 잘못되었습니다.");
//			System.exit(0);
//		}
//		}

		// switch식
		result = switch(choice) {
		case 1 -> num1 + num2;
		case 2 -> num1 - num2;
		case 3 -> num1 * num2;
		case 4 -> num1 / num2;
		default -> 0.0;
		};
		System.out.printf("결과는 :%, .2f%n", result);

		
		keyin.close();
	}

}
