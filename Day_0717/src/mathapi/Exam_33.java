/*
 * [문제-33] ArrayList에 저장되어 있는 데이터를 이용하여 합계, 평균을 구한 후
 * 저장하는 프로그램을 작성하세요.
 */

package mathapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam_33 {

	public static void main(String[] args) {
		List<String> source = Arrays.asList(
			"홍길동 100 98 95",     // source.get(1) ==> split으로 끊으면, String[] ==> "100" "95" - Integer.parseint로 해서 계산
			"임꺽정 85 77 68",
			"전우치 88 65 74",
			"손오공 100 99 87",
			"사오정 74 58 99");
		
		List<String> target = new ArrayList<>();
		// "홍길동 100 95 85 xxx xx.xxx"
		
		// API : String - split(), format()  /  Integer - parseInt()  /  StringBuffer - append()
		// 		List - get(), add()
		// 최종 출력 : forEach()
		
//		for(int i=0; i<source.size(); ++i) {
//			String temp = source.get(i);
//			String[] tmp = temp.split(" ");
//			StringBuffer tmpB = new StringBuffer();
//			tmpB.append(tmp[0]).append("\t");
//			
//			int sum = 0;
//			for (int j=1; j<tmp.length;++j) {
//				sum += Integer.parseInt(tmp[j]);
//				tmpB.append(tmp[j]).append("\t");
//			}
//			
//			double mean = sum / 3.0;
//			tmpB.append(sum).append("\t");
//			tmpB.append(String.format("%.2f", mean));
//			target.add(tmpB.toString());
//		}
//		
//		target.forEach(System.out::println);
		
		
		for(int i=0; i<source.size(); ++i) {
			String[] temp = source.get(i).split(" ");
			String name = temp[0];
			
			int total = 0;
			double avg = 0;
			for (int j=1; j<temp.length; ++j) {
				total += Integer.parseInt(temp[j]);
			}
			avg = total / 3.0;
			
			target.add(String.format("%s %3s %3s %3s %4d %.2f", name, temp[1], temp[2], temp[3], total, avg));
		}
		target.forEach((s) -> System.out.println(s));
		
	}
}