package myException;

public class ExceptionTest_02 {

	public static void main(String[] args) throws Exception{
		double result = 0;
		
		result = divide(10, 0);
		
		System.out.println(result);
	}
	
	public static double divide(int a, int b) throws Exception {
		// 1) 익셉션을 직접 처리
//		try {
//			if(b == 0) 
//				throw new Exception("분모는 0이면 안 됩니다.");   // exception 개체를 자바 가상 머신에 전달 (던짐) -> 다시 호출 (캐치)
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}
		
		// 2) 익셉션을 전가
		if(b == 0) {
			throw new Exception("분모는 0이면 안 됩니다.");    // throws Exception을 타고 나감  ->  main에서 try-catch로 해결 (-> main에서 던지고, 자바 가상 머신에서 해결)
			
		}
		
		return a / b;
	}
}
