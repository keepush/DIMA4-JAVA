package dateapi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.ZoneId;

public class LocalDateTimeTest_04 {
	public static void main(String[] args) {
	LocalDateTime koreanWar = LocalDateTime.of(1950, 6, 25, 0, 0, 0);
	LocalDateTime independence = LocalDateTime.of(1945, 8, 15, 0, 0);
	LocalDateTime surrender = LocalDateTime.of(1945,  8, 15, 0, 0);
	
	if(independence.isBefore(koreanWar))
		System.out.println("광복 이후 한국 전쟁이 발발하였다.");
	
	if(koreanWar.isAfter(independence))
		System.out.println("한국 전쟁은 광복 이후에 발발하였다.");
	
	if(independence.isEqual(surrender))
		System.out.println("일왕의 항복과 대한독립은 같은 날에 일어났다");
	
	if(independence.compareTo(surrender) == 0)
		System.out.println("일왕의 항복과 대한독립은 같은 날에 일어났다.");
	}
}
