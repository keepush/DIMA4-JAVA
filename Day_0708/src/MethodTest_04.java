// Call by reference = 참조 변수를 넘겨 주는 것 (일반 변수를 넘기는 건 X) 

public class MethodTest_04 {

	public static void main(String[] args) {
		int[] a = {10, 20};
		
		System.out.println("a[0]" + a[0] + ", a[1]=" + a[1]);
		exchange(a);
		System.out.println("a[0]" + a[0] + ", a[1]=" + a[1]);

	}

	public static void exchange(int[] a) {
		int temp;
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	
}
