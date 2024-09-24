
public class Third {
	public static void main(String[] c) { 
		byte a = 10;       // 변수를 선언하고 값을 초기화 (initialize)
		a = -12;           // 대입(assignment)
		short b = 123;
		int i = 10;        // 가장 많이 사용하는 데이터 타입
		// i = 52;         // i = 52 가능하나, i = 52L 불가능 (큰 메모리의 값을 작은 메모리로 치환하는 시도는 오류)
		
		long lo = 10L;     // int와 다를 바 없기 때문에 뒤에 L 기입
		System.out.println(a);
		System.out.println(b);
		System.out.println(i);
		System.out.println(lo);
		System.out.println("=====================");
		
		float f = 42.195F;
		double d = 3.141592;
		double d1 = 3.14E12;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(d1);
		System.out.println("=====================");
		
		char ch = 'a';      // 'a' : 97,  'A' : 65  ,  ' ' : 32
		char ch1 = 97;
		char ch2 = '가';
		System.out.println(ch);
		System.out.println(ch1);
		
		System.out.println(ch2);
		System.out.println((int) ch2);
		System.out.println(ch + 1);
		System.out.println('a' > 'b');
		System.out.println((int)' ');
		System.out.println((char)('a' - ' '));
	}
}

/*
 * 자바의 자료형 (Data Type)
 * 1) 기초자료형 (Primitive type) : Stack 메모리 공간에 데이터 저장
 * 		수치형 - byte(1)  :  8 비트 할당 - 128 ~ 127까지 넣을 수 있다.
 *             - short(2) : 16 비트 할당
 *             - int(4)   : 32 비트 할당 -2147483648 ~ 2147483647
 *             - long(8)  : 64 비트 할당
 *             
 *             - float(4) : 
 *             - double(8): 
 *             
 *             - char(2)  : 음수값을 넣을 수 없음. 문자를 지정하기 위한 용도
 *           
 *      진위형 - boolean(1) : true, false 값을 처리
 * 2) 참조형 (Reference type) : Heap 메모리 공간에 데이터를 저장하고, 그 저장 위치를 변수에 담아 사용
 * 			- class, array, enum....
 *   
 *           
 * */