package stringapi;

// String에 있는 메소드만 사용하여 처리할 것.
public class Test {

	public static void main(String[] args) {
		String n1 = "123"; // 1자리 이상 5자리 이하 어떤 문자열  ==> 숫자로 변환(단, charAt())
		String n2 = "45";
		
		// 1을 따 와서 숫자로 바꾸고... * 100
		int num1 = 0;
		num1 += (n1.charAt(0) - '0') * 100;
		num1 += (n1.charAt(1) - '0') * 10;
		num1 += n1.charAt(2) - '0';
		
		System.out.println(num1);
		
		int num2 = 0;
		for(int i=0; i<n2.length();++i) {
			num2  = num2 * 10 + (n2.charAt(i)-'0');
		}
		
		System.out.println(num2);

	}

}
