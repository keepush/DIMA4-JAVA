
public class StaticDataTest {

	public static void main(String[] args) {
		System.out.println("static 변수: " + StaticData.CODE );

		StaticData data = new StaticData();
		System.out.println("멤버 변수: " + data.title); //객체 이름을 가지고 접근.

		data.process(55);

	}

}
