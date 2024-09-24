import java.util.Arrays;

public class DeepCopyTest_02 {

	public static void main(String[] args) {
		int[] ary1 = {1, 2, 3, 4, 5};
		int[] ary2 = Arrays.copyOfRange(ary1, 1, 10); // to가 원본크기보다 크면 자동 0 채우기 
		System.out.println();
		

		ary2[0] = 100; 
		
		// 원본 배열
		for(int temp : ary1)
			System.out.print(temp + " ");
		System.out.println();
		// 복사 배열 
		for(int temp : ary2)
			System.out.print(temp + " ");
		System.out.println();

	}

}
