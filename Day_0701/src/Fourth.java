
public class Fourth {
	public static void main(String[] args) {
		int a = 0b1010;
		System.out.println(a);
		
		int b = 0xef;    //  1110 1111
		System.out.println(b);
		
		int c = 1_234_567_890;
		System.out.println(c);
		
		System.out.println("=============");
		
		// 왜 0.3이 아닐까?   10진수 0.2를 2진수로 변환하는 과정에서 오차 발생함
		System.out.println(0.1 + 0.2);
		
		System.out.println((0.1 + 0.2) == 0.3);
		
		// System.out.println(10/0);
		System.out.println(-0.1/0);  // 무한대 (Infinity)   double 나누기 int  => type 맞추게 됨 => 0.0(아주 작은 값)조차 메모리에 넣을 수 없음
		byte b1 = (byte)(127+1);
		System.out.println(b1);      // -128
		
		byte b2 = 1;  // 초기화 또는 대입할 때에는 int형을 byte에 대입 가능
		// b2 = (byte)b2 + 2;
					  // 연산자가 여러 개  1) + : byte와 int 연산을 시도 -> 타입이 안 맞음 -> (int) + int  -> 결과는 int     
					  // 				   2) = : 대입을 시도  => int 타입을 byte에 넣으려는 시도로 인식 --> 오류
		// System.out.println(b2);
	}
}
