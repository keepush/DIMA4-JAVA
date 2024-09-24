package myException;

public class ExceptionTest_01 {

	public static void main(String[] args) {
		String[] str = {"3", "7", "a"};
		try {
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[1]);
			int nun3 = Integer.parseInt(str[2]);  // NumberFormatException : 문자열을 숫자로 변경할 수 없음.
			int num4 = Integer.parseInt(str[3]);  // ArrayIndexOutOfBoundsException
			
			int result = num1 / num2;             // ArithmeticException
			
			System.out.println("처리 결과: " + result);
		} catch (NumberFormatException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		String a = str[0];   // "1" 가져옴
//		int b = 3;   // Integer.parseInt("1") + 3 == 3
//		// 문자열 "1"을 숫자 1로 바꾸려면 구분분석을 실시해야 한다.
//		// Integer.parseInt("1");  ==> 숫자 1로 반환한다.
//		int c = Integer.parseInt(a);
//		int result = b / c;
//		System.out.println(result);
	}

}
