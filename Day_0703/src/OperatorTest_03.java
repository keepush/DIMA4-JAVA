
public class OperatorTest_03 {

	public static void main(String[] args) {
		int x = 0, y;
		
		++x;
		System.out.println(x);   // 1
		System.out.println(++x); // 2
		
		x = 0;
		x++;
		System.out.println(x);  // 1
		System.out.println(x++); // 1 출력 후 증가
		
		x = 0;
		y = ++x;
		System.out.println(x + ", " + y);   // 1, 1
		
		x = 0;
		y = x++;
		System.out.println(x + ", " + y);   // 1, 0
		
		// ------------------------
		
		

	}

}
