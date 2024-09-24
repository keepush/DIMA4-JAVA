
public class OverloadingTest_01 {

	public static void main(String[] args) {
		double x = 1.1;
		double y = 2.5;
		
		add(x, y);
		add(1, 2);
		add('a', 'b');
		add(1F, 4F);
		
		System.out.println();
		System.out.println(12);
		System.out.println("안녕?");
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b;
	}
}
