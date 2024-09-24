
public class OperatorTest_05 {

	public static void main(String[] args) {
		byte a = 0b00001111;     // 0000 1111
		byte b = 0x0f;           // 0000 1111
		byte c = 15;             // 0000 1111
		
		System.out.println(a + ", " + b + ", " + c);
		
		int x = 3;               // 0000 0011
		int y = 2;               // 0000 0010
		int z;
		
		// & : 둘 다 1일 때만 1임 (bit clear)
		z = x & y;
		System.out.println("x & y = " + z);
		
		
		// | : 둘 중 하나만 1이면 1
		z = x | y;
		System.out.println("x | y = " + z);
		
		// ^ : 배타적 논리합(두 개의 값이 다를 때만 1)
		z = x ^ y;
		System.out.println("x ^ y = " + z);
		
		// ~ : 1의 보수
		x = -1;     //  1111 1111 1111 1111 1111
		z = ~x;     //  0000 0000 0000 0000 0000
		System.out.println("~x = " + z);
		
		// 0000 0010 -> 1111 1101  -> 1111 1110 (-2의 비트 표현)
		int temp = 0xfffffffe;
		System.out.println(temp);
		
		// x << 1     0000 0001
		x = 1;
		x = x << 1;
		System.out.println("x << 1 = " + x);    // 2
		
		x = x << 1;
		System.out.println("x << 1 = " + x);    // 4
		
		x = x << 1;
		System.out.println("x << 1 = " + x);    // 8
		
		x = 1;
		x = x << 31;
		System.out.println("x << 31 = " + x);    // -2147483648
		
		
		x = Integer.MIN_VALUE;
		System.out.println(x);
		
		x = x >>> 1;
		System.out.println("x >>> 1 = " + x);
		
		x = Integer.MIN_VALUE;
		x = x >> 1;     // 부호 자리에는 부호가 그냥 있는 상태
		System.out.println("x >> 1 = " + x);
		// 1000 0000 0000 0000 0000 0000 0000 0000
		// 1100 0000 0000 0000 0000 0000 0000 0000    - 부호 그대로 유지 (산술 shift)
		
		
	}

}
