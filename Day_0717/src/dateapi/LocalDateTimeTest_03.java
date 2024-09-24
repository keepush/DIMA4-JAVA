package dateapi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTest_03 {
	public static void main(String[] args) {
		LocalDateTime localDateTime1 = LocalDateTime.of(2024, 1, 15, 10, 0, 0);
		String format1 = localDateTime1.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
		String format2 = localDateTime1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS"));
		System.out.println("localDateTime = " + localDateTime1);
		System.out.println("Format1 = " + format1);
		System.out.println("Format2 = " + format2);
		
		// DateTimeFormat에 등록된 "ISO 8601" 날짜 포맷 사용
		String format3 = localDateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("localDateTime = " + localDateTime1);
		System.out.println("Format3 = " + format3);
		
		System.out.println();
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Year => " + now.getYear());
		System.out.println("Month => " + now.getMonth());
		System.out.println("DayOfMonth => " + now.getDayOfMonth());
		System.out.println("DayOfWeek => " + now.getDayOfWeek());
		System.out.println("DayOfYear => " + now.getDayOfYear());
		System.out.println("Hour => " + now.getHour());
		System.out.println("Minute => " + now.getMinute());
		System.out.println("Second => " + now.getSecond());
		System.out.println("Nano second => " + now.getNano());
		
		System.out.println();
		
		System.out.println("현재: " + now);
		System.out.println();
		System.out.println("10년 후: " + now.plusYears(10));
		System.out.println("10개월 후: " + now.plusMonths(10));
		System.out.println("10일 후: " + now.plusDays(10));
		System.out.println("10시간 후: " + now.plusHours(10));
		System.out.println("10분 후: " + now.plusMinutes(10));
		System.out.println("10초 후: " + now.plusSeconds(10));
		
		System.out.println();
		System.out.println("10년 전: " + now.minusYears(10));
		System.out.println("10개월 전: " + now.minusMonths(10));
		System.out.println("10일 전: " + now.minusDays(10));
		System.out.println("10시간 전: " + now.minusHours(10));
		System.out.println("10분 전: " + now.minusMinutes(10));
		System.out.println("10초 전: " + now.minusSeconds(10));
	}
}
