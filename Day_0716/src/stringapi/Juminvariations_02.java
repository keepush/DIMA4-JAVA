/*
 *  LocalDate 클래스를 이용하여 나이 계산하는 로직이 추가
 *  - 주의) 현재 날짜 - 생년월일 = 나이
 *  		생년월일보다 현재 날짜가 과거이면 안 됨
 *  
 *  		메소드를 생성하여 나이 계산하는 로직 추가할 것!
 */

package stringapi;

import java.time.LocalDate;
import java.util.Scanner;

public class Juminvariations_02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String jumin;
		
		System.out.print("# 주민번호 입력 : ");
		jumin = keyin.next();

		if (jumin.length() != 14) {
			System.out.println("# 잘못된 주민번호입니다. (길이)");
			System.exit(0);
		}
		
		if (isValid(jumin)) {
			System.out.println("# 잘못된 주민번호입니다. (-)");
			System.exit(0);
		}
		String[] str= jumin.split("-");
		if (!(isNumeric(str[0]) && isNumeric(str[1]))) {
			System.out.println("# 잘못된 주민번호입니다. (숫자)");
			System.exit(0);
		}
		
		char gt = jumin.charAt(7);
		if(!(gt >= '1' && gt <= '4')) {
			System.out.println("# 잘못된 주민번호입니다. (성별)");
			System.exit(0);
		}
		
		int age = calcAge(jumin);
		
		if(age < 0) {
			System.out.println("# 잘못된 주민번호입니다. (나이)");
			System.exit(0);
		}
		
		// 검증할 수 있는 조건 구비
		if(!(codeCheck(jumin))) {
			System.out.println("# 잘못된 주민번호입니다. (검증알고리즘)");
			System.exit(0);
		}
		
		// 올바른 주민번호
		String year, month, day, gender;
		
		year = birthyear(jumin);
		month = jumin.substring(2, 4);
		day = jumin.substring(4, 6);
		gender = genderCheck(jumin);
		
		System.out.println("당신은 " + year + "년 " + month + "월 " + day + "일생 " + "만 " + age + "세" + gender + "입니다.");
}
		
	// 나이 계산
	private static int calcAge(String jumin) {
		 int year = Integer.parseInt(birthyear(jumin));
	      int month = Integer.parseInt(jumin.substring(2,4));
	      int day = Integer.parseInt(jumin.substring(4,6));

	      LocalDate birth = LocalDate.of(year, month, day);
	      LocalDate today = LocalDate.now();

	      // 태어난 연도 == 올해 연도
	      // 태어난 월 == 올해 월
	      // 태어난 일 <= 오늘

	      int age = 0;
	      if(today.isBefore(birth)) return -1;

	      if(today.getYear() - year >= 0)
	         age = today.getYear() - year; 

	      // 생일이 오늘을 지나지 않았는지
	      if(today.getDayOfYear() - birth.getDayOfYear() < 0) {
	         age -= 1;
	      }

	      return age;

	}
	
	// 주민번호 전달받아 검증코드 알고리즘 수행
	// 123456-5678901
	private static boolean codeCheck(String id) {
		int total = 0; // 합계
		int temp =0;  // 주민번호 한 개씩 따와 저장할 변수
		int value = 2;
		
		for(int i=0; i<id.length()-1; ++i) {
			if(i == 6) continue;   // '-'를 건너뛰는 로직
			temp = id.charAt(i) - '0';
			total += temp * value;
			value++;
			
			if(value == 10) value = 2;
		}
		
		int position = id.length()-1;
		int check = id.charAt(position) - '0';
		
		int tmp = 11 - (total%11);
		
		if(tmp > 9) tmp = tmp % 10;   // 2000
		
		if (tmp == check) return true;
		
		return false;
	}
	
	
	// 주민번호 전달받아 성별 위치의 값이 1, 2면 1900년도 생으로 3,4 이면 2000년대 생으로
	private static String birthyear(String id) {
		String birth = null;
		char gender = id.charAt(7);
		
		if (gender == '1' || gender == '2') 
			birth = "19".concat(id.substring(0, 2));
		else 
			birth = "20".concat(id.substring(0, 2));
		
		return birth;
	}
	
	
	// 전달받은 주민번호로 1, 3이면 "남자", 2, 4면 "여자" 라는 문자열 반환
	private static String genderCheck(String id){
		if((id.charAt(7) -'0') % 2 == 0) return "여성";
		return "남성";
	}
	
	
	// '-' 위치에 문자열이 올바르게 포함되었는지 체크, 성별 범주가 1-4까지인지
	private static boolean isValid(String id) {
		
		if (id.charAt(6) == '-') return false;
		
		char gender = id.charAt(7);
		if(gender >= '1' && gender <= '4') return true;
		
		return false;
	}
	
	
	// '-' 앞과 뒤에 숫자로만 되어 있는지 체크
	// 191225-1234567
	public static boolean isNumeric(String id) {
		for (int i=0; i<id.length(); ++i) {
			char ch = id.charAt(i);
			if(!(ch >= '0' && ch <='9'))
				return false;
		}
		return true;
	}
}
