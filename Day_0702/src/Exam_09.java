import java.util.Scanner;

public class Exam_09 {

	public static void main(String[] args) {
		double year = 365.2422, second, temp;
		int day, hour, minute;
		
		//일
		day = (int)year;
		temp = year - day;
		
		// 시간
		temp = temp * 24;
		hour = (int)temp;
		
		// 분
		temp = temp - hour;
		temp = temp * 60;
		minute = (int)temp;
		
		// 초
		temp = temp - minute;
		temp = temp * 60;
		second = temp;
		
		System.out.printf("1년은 %.4f일이고, 이것은 %d일 %d시간 %d분 %.2f초입니다.", year, day, hour, minute, second);
		

	}

}
