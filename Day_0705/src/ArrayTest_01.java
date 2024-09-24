
public class ArrayTest_01 {

	public static void main(String[] args) {
		// 정수배열 생성 후 초기화
//		int[] iary = new int[10];
//		iary[0] = 15;
//		iary[1] = 5;
	
		int[] iary = new int[10];
//		int[] iary  = new int[] {15, 5, 7, 0, 0, 0, 0, 0};
		
		// 0~1
		iary[0] = (int)(Math.random()+100);
		
		// 데이터를 발생시켜 초기화 (100: 0-99 ) (101: 10-110)
		// 1-100
		for(int idx=0; idx < iary.length; ++idx)
			iary[idx] = (int)(Math.random()*101 + 10);
		
		// 출력
		for(int idx=0; idx < iary.length; ++idx)
			System.out.println(iary[idx]);

	}

}
