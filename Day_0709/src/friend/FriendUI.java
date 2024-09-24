package friend;

import java.util.Scanner;

public class FriendUI {
	// Have-A 관계
	Scanner keyin = new Scanner(System.in);
	FriendVO friend = new FriendVO();   // 기본값으로 초기화된 채 생성 @100

	// 생성자
	public FriendUI() {
		String choice;
		while(true) {
			menu();
			choice = keyin.next();
			
			switch(choice) {
			case "1" : create(); break;
			case "2" : retrieve(); break;
			case "3" : update(); break;
			case "4" : delete(); break;
			case "0" : System.out.println("## 프로그램을 종료합니다.");
					return;  // - 호출한 쪽으로 돌아감
//					System.exit(0); - 돌아가지 않고 종료
			
			}
		}
	}
	
	private void delete() {
		String name = friend.getName();
		String check;
		
		if (name == null) {
			System.out.println("## 저장된 정보가 없습니다.\n");
			return;
		}
		
		friend.output();
		System.out.print("## 정말로 삭제할까요?(Y/N)");
		check = keyin.next();
		
		if(!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 삭제가 취소되었습니다.\n");
			return;
		}
		friend.setName(null);     // NullPointerException이 발생할 수 있다.
		friend.setPhone(null);
		friend.setAge(0);
		
		System.out.println("## 삭제완료\n");
		
		
	}
	
	/*
	 *  저장된 전화번호부의 전화번호와 나이를 수정
	 */
	private void update() {
		String phone, check;
		int age;
		
		String name = friend.getName();
		if (name == null) {
			System.out.println("## 저장된 정보가 없습니다.\n");
			return;
		}
		
		friend.output();
		
		System.out.print("> 전화번호: ");
		phone = keyin.next();
		
		System.out.print("> 나이: ");
		age = keyin.nextInt();
		
		System.out.print("## 정말로 수정할까요?(Y/N)");
		check = keyin.next();
		
		if(!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 수정작업이 취소되었습니다.\n");
			return;
		}
		
		friend.setPhone(phone);
		friend.setAge(age);
		
		System.out.println("## 수정완료\n");
	}
	
	/*
	 *  저장된 전화번호부의 데이터를 출력
	 */
	private void retrieve() {
		String name = friend.getName();
		if (name == null) {
			System.out.println("## 저장된 정보가 없습니다.\n");
			return;
		}
		friend.output();
	}
	

	/*
	 *  한 사람의 정보를 입력받아 대입하는 메소드
	 */
	private void create() {
		// 지역변수 선언
		String name, phone;
		int age;
		
		System.out.print("> 이름: ");
		name = keyin.next();
		
		System.out.print("> 전화번호: ");
		phone = keyin.next();
		
		System.out.print("> 나이: ");
		age = keyin.nextInt();
		
		friend.setName(name);
		friend.setPhone(phone);
		friend.setAge(age);
		
		System.out.println("## 저장완료\n");
		
	}
	
	/*
	 *  메뉴를 화면에 출력
	 *  C(Create), R(Retrieve), U(Update), D(Delete)
	 */
	private void menu() {
		System.out.println("--- [ 전화 번호부 ] ---");
		System.out.println("      1) 저   장");
		System.out.println("      2) 조   회");
		System.out.println("      3) 수   정");
		System.out.println("      4) 삭   제");
		System.out.println("      0) 종   료");
		System.out.println("-----------------------");
		System.out.print("      # 선택: ");
		
	}
}
