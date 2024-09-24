package 시험;

import java.util.Scanner;


public class EnrolMain {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Man[] People = new Man[2];
		int count=0;
		String choice;
		
		System.out.println(" Speacker 등록 메인 메뉴입니다. 단 2명만 등록할 수 있습니다.");
		while(true) {
			System.out.println(" 어떤 Speaker를 등록하는지 선택하세요.");
			System.out.println("1. Reader 등록");
			System.out.println("2. Worker 등록");
			choice = keyin.next();
			
			switch(choice) {
			case "1" : {
				String name;
				System.out.println("이름을 입력하세요.");
				name = keyin.next();
				
				Man man = new Reader(name);
				People[count++] = man;
				break;
			}
			case "2" : {
				String name;
				System.out.println("이름을 입력하세요.");
				name = keyin.next();
				
				Man man = new Worker(name);
				People[count++] = man;
				break;
			}
			}
			
			if(!(choice.equals("1") && choice.equals("2"))) {
				System.out.println("# 숫자를 잘못 입력하셨습니다.");
				return;
			}
			
			if(count == 2) {
				System.out.println("두 명 Speaker의 등록이 완료되었습니다. 이제 Speaker들의 speak 실행 결과입니다.");
				for(int i=0; i<count; ++i) {
					if( People[i] instanceof Reader) {
						Reader reader = (Reader)People[i];
						System.out.println(reader.speak());
					}
					else if (People[i] instanceof Worker) {
						Worker worker = (Worker)People[i];
						System.out.println(worker.speak());
					}
				}
				
				break;
			}
			}
			
		}

	}

