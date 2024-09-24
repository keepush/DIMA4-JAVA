package 시험;

public class StringToNumber {

	public static void main(String[] args) {
		String source = "2345";
		int data = 19;
		
		if (!(isNumber(source))) {
			System.out.println("# 숫자 이외의 문자가 포함되어 있습니다.");
			System.exit(0);
		}
		
		int translate = toNumber(source);
		
		System.out.println("덧셈 연산의 결과 : " + (translate + data));   // 곱셈 연산의 결과 : 44,555

	}
	
	
	// 전달된 문자열 내에 숫자 이외의 특수기호가 포함되어 있는지 여부 판단하여 true, false 반환
	public static boolean isNumber(String str) {
		for (int i=0; i<str.length(); ++i) {
			char ch = str.charAt(i);
			if(!(ch >= '0' && ch <='9'))
				return false;
		}
		return true;
	}
	
	
	// 전달받은 문자열 내의 숫자 Digit 값을 연산이 가능한 정수형으로 변환
	public static int toNumber(String str) {
			int num = 0;
			num += (str.charAt(0) - '0') * 1000;
			num += (str.charAt(1) - '0') * 100;
			num += (str.charAt(2) - '0') * 10;
			num += str.charAt(3) - '0';

		
		return num;
	}

}
