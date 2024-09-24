package dateapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest_01 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.now();
		LocalDate d2 = LocalDate.of(1919, 3, 1);
		
		LocalTime t1 = LocalTime.now();
		LocalTime t2 = LocalTime.of(12, 40, 45);
		
		LocalDateTime dt1 = LocalDateTime.now();
		LocalDateTime dt2 = LocalDateTime.of(1950, 6, 25, 0, 0, 0);
		
		LocalDateTime dt3 = LocalDate.now().atTime(LocalTime.MIDNIGHT);
		LocalDateTime dt4 = LocalDate.now().atTime(LocalTime.MAX);
		
		System.out.println("LocalDate.now() : " + d1);
		System.out.println("LocalDate.of() : " + d2);
		System.out.println("LocalTime.now() : " + t1);
		System.out.println("LocalTime.of() : " + t2);
		System.out.println("LocalDateTime.now() : " + dt1);   // 날짜 시간 사이에 T로 구분
		System.out.println("LocalDateTime.of() : " + dt2); 
		System.out.println("LocalDate.now().atTime(LocalTime.MIDNIGHT) : " + dt3); 
		System.out.println("LocalDate.now().atTime(LocalTime.MAX) : " + dt4); 
	}
}
