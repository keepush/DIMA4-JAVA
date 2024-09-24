package dateapi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;

public class LocalDateTimeTest_02 {
	public static void main(String[] args) {
		// now()
		LocalDateTime time1 = LocalDateTime.now();
		LocalDateTime time2 = LocalDateTime.now(Clock.systemDefaultZone());   //  기본 시스템 시계의 날짜와 시간
		LocalDateTime time3 = LocalDateTime.now(ZoneId.of("Asia/Seoul"));   // 서울 시간대의 현재 날짜, 시간
		
		// of()
		LocalDateTime time4 = LocalDateTime.of(2024, 1, 15, 0, 0, 0);
		LocalDateTime time5 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		
		// parse()
		LocalDateTime independent = LocalDateTime.parse("1945-08-15T15:36:00.000");  // 문자열을 LocalDateTime 객체로 파싱
		System.out.println("광복절 일왕 방송: " + independent);
		LocalDateTime xmas = LocalDateTime.of(2024, 12, 25, 0, 0, 0);
		System.out.println("2024년 Christmas: " + xmas);
		
		// at()
		LocalDateTime vote = Year.of(2024).atMonth(4).atDay(10).atTime(10, 00);
		System.out.println("22대 국회의원선거일: " + vote);
		LocalDateTime time7 = LocalDate.now().atTime(10, 30);
		LocalDateTime time6 = Year.of(2024).atMonth(1).atDay(15).atTime(10, 30);
	}
}
