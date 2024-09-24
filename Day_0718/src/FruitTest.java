
public class FruitTest {

	public static void main(String[] args) {
		Fruit1 f = Fruit1.바나나;    // Enum 타입 (static final 상수)
		
		System.out.println(f + "("+f.eng+")");
		
		// Reflection 이용하면 5라인처럼 변수명을 조회할 수 있다.
		String f2 = Fruit2.STRAWBERRY;
		System.out.println(f2);    // 변수명 조회는 지금 안 됨
	}

}
