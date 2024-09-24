/*
 * [문제-28] 2차원 정수 배열 6x6 생성
 * 			 1~10 사이의 난수를 발생시켜 0, 0-5, 5열까지 초기화
 * 			 6행과 6열은 각 행과 열의 합이 저장되도록 처리한다.
 * 			 
 * 			 1 2 3 4 5 15
 * 			 1 2 4 4 5 16
 */
public class Exam_28 {

	public static void main(String[] args) {
		int[][] iary = new int[6][6];
		
		for (int i=0; i<(iary.length-1); ++i) {
			for (int j=0; j<iary.length-1; ++j) {
				iary[i][j] = (int)(Math.random()*10+1);
				iary[5][j] += iary[i][j];   // 각 열의 합
				iary[i][5] += iary[i][j];   // 각 행의 합
			}
		}
		
		 // 마지막 요소 (iary[5][5]) 계산
        for (int i = 0; i < iary.length - 1; ++i) {
            iary[5][5] += iary[i][5];
        }
        for (int j = 0; j < iary.length - 1; ++j) {
            iary[5][5] += iary[5][j];
        }
		
		
		for(int i=0; i < iary.length; ++i) {
			for(int j=0; j < iary.length; ++j) {
				System.out.print(iary[i][j] + " ");
			}
				System.out.println();
		}
		
	}

}
