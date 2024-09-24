package myenum;

public class FruitTest_02 {

	public static void main(String[] args) {
		Fruit1 apple = Fruit1.사과;   // enum
		String english = apple.eng;
		
		System.out.println(apple);
		// Fruit1 데이터의 값을 가져오는 메소드
		System.out.println(apple.name() + " : " + english);
		
		// values() : Fruit1 내에 선언된 모든 데이터를 배열로 반환
		Fruit1[] fary = Fruit1.values();
		System.out.println("아이템 개수: " + fary.length);
		
		System.out.println();
		for(Fruit1 f : fary) System.out.println(f);
		
		// ---------------
		Fruit1 ftemp = Fruit1.바나나;
		
		switch(ftemp) {
		case 바나나 : System.out.println("바나나는 노랗습니다."); break;
		case 사과 : System.out.println("사과는 빨갛습니다."); break;
		case 딸기 : System.out.println("딸기는 달콤합니다."); break;
		default : 
		}
		
		// -------------- valueOf(String) : 데이터와 매칭되는 Enum 타입을 반환
		Fruit1 ftmp = Fruit1.valueOf("딸기");
		System.out.println(ftmp);
		
		// --- 문자열로 반환 (name(), toString() - Enum에서 상속받음) - 결과 일 
		String ftmp1 = ftmp.name();
		System.out.println(ftmp1);
		
		String ftmp2 = ftmp.toString();
		System.out.println(ftmp2);
		
		System.out.println(ftmp1.equals(ftmp2));
		
		// ---
		Fruit1 ftmp3 = Fruit1.바나나;
		
		int ord = ftmp.ordinal();
		System.out.println(ord);
	}

}
