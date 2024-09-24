/*
 * [문제-25] int 배열 10개를 선언하고, 난수를 1-100 사이로 발생시켜 초기화한 후,
 * 			 교환하는 프로그램 생성
 * 			 
 * 			가장 맨앞의 데이터와 맨뒤의 데이터 교환
 * 			맨앞+1  맨뒤-1  데이터 교환
 */

public class Exam_25 {

	public static void main(String[] args) {
		int[] iary = new int[10];
		int temp;
		
		for(int idx=0; idx < iary.length; ++idx)
			iary[idx] = (int)(Math.random()*101);
		
		System.out.println("-- 교환 전 --");
		for(int idx=0; idx < iary.length; ++idx)
			System.out.print(iary[idx] + " ");
		
		System.out.println();
		
		for (int i=0; i < iary.length/2; ++i) {
			if (i >= iary.length/2) break;
			temp = iary[i];
			iary[i] = iary[iary.length-(i+1)];
			iary[iary.length-(i+1)] = temp;
		}
		
		System.out.println("-- 교환 후 --");
		for (int idx=0; idx < iary.length; ++idx)
			System.out.print(iary[idx] + " ");
		
	}

}
