package myException;

public class Exam_32 {

	public static void main(String[] args) {
		int[] myAry = new int[10];  // 짝수만 담기는 배열
		int count = 0;
		
//		for(int i=0; i<10; ++i) {
//			try{
//				myAry[i] = even();
//			} catch(Exception e) {
//				e.getMessage();
//				--i;
//			}
//		}
		
		while(count < 10) {
			try{
				myAry[count] = even();
				++count;
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		
	
		// Advanced for로 출력
		for (int i:myAry) System.out.print(i+" ");
		
		System.out.println();
	}
	
	// 정수값 난수를 발생시키는 메소드
	// 홀수가 발생되면 익셉션
	// 짝수가 발생되면 반환
	public static int even() throws Exception{
		int num = (int)(Math.random() * 100) +1;
		if (num % 2 != 0) {
			System.out.print(num + " : ");
			throw new Exception("홀수값이 발생되었습니다.");
		}
		System.out.println(num);
		return num;
	}

}
