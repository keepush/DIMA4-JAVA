/*
 *  public static void exchange(int a, int b);
 *  Call by Value : 값에 의한 호출, 원본에 접근할 수 없다
 */
public class MethodTest_03 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a=" + a + ", b=" + b);
		exchange(a, b);
		System.out.println("a=" + a + ", b=" + b);
	}
	
	// 데이터가 exchange 안에서 바뀌는데 중괄호({)를 만나면 데이터가 날아감  ->  main에 반영 X, 지역변수라서 싹 사라짐..
	// 
	
	public static void exchange(int a, int b) {
		int temp;
		
		temp = a;
		a = b;
		b = temp;
	}
}