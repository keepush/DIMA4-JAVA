
public class ArrayTest_02 {

	public static void main(String[] args) {
		String[] name = {"홍길동", "전우치", "손오공", "저팔계", "콩쥐", "팥쥐"};
		int[] mat = {89, 75, 99, 65, 85, 75};
		int[] kor = {65, 85, 99, 100, 75, 65};
		int[] total = new int[name.length];
		
//		for(int i=0; i<name.length; ++i)
//			System.err.printf("%s%n", name[i]);
		
//		// 향상된 for문으로 name 값 추출
//		for(String temp : name)
//			System.out.printf("%s%n", temp);
		
		// 학생명 mat점수 kor점수 total 점수가 순서대로 출력되게 할 것
		for (int i=0; i<name.length; ++i) total[i] = mat[i] + kor[i];
		
		System.out.println("학생명\t mat\t kor\t total");
		for (int i=0; i<name.length; ++i) {
			System.out.printf("%3s\t %3d\t %3d\t %3d\t\n", name[i], mat[i], kor[i], total[i]);
		}
	}

}
