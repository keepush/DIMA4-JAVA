package ui;

import java.util.Scanner;

import service.PhoneBookServiceImpl;
import vo.PhoneBook;

public class PhoneBookUI {
	Scanner keyin = new Scanner(System.in);
	PhoneBookServiceImpl service = new PhoneBookServiceImpl();
	
	public PhoneBookUI() {
		String choice;
		
		while(true) {
			System.out.println("[ 전화번호부 관리 ]");
			System.out.println(" 	1. 저  장	 ");
			System.out.println(" 	2. 조  회	 ");
			System.out.println(" 	3. 수  정	 ");
			System.out.println(" 	4. 삭  제	 ");
			System.out.println(" 	5. 전체 조회   ");
			System.out.println(" 	0. 종  료	 ");
			System.out.println("---------------------");
			System.out.print(" 	# 선 택  -> 	");
			
			choice = keyin.next();
			
			switch(choice) {
			case "1": insert(); break;
			case "2": retrieve(); break;
			case "3": update(); break;
			case "4": delete(); break;
			case "5": retriveAll(); break;
			case "0":
				System.out.println("## 프로그램을 종료합니다.");
				return;
			default:
				System.out.println("## 잘못된 번호를 입력하였습니다.");
				return;
			}
		}
	}
	
	private void insert() {
		System.out.println("새로운 연락처 등록");
		String phoneNumber, name, relation, check;
		int age;
		
		if(service.getCount() >= 10) {
			System.out.println("## 회원가입을 할 수 없습니다.");
			return;
		}
		
		System.out.print("# 전화번호: ");
		phoneNumber = keyin.next();
		
		// 동일한 아이디가 있는지 중복체크
		if(service.selectOne(phoneNumber) != null) {
			System.out.println("err> 중복된 번호가 있습니다.");
			return;
		}
		
		System.out.print("# 이름 : ");
		name = keyin.next();

		System.out.print("# 관계: ");
		relation = keyin.next();

		System.out.print("# 나이: ");
		age = keyin.nextInt();
	
		System.out.print("저장하시겠습니까? (y/n)");
		check = keyin.next();
		
		if(!(check.equals("Y") || check.equals("y"))) {
			System.out.println("## 저장이 중단되었습니다.");
			return;
		}
		
		PhoneBook Book = new PhoneBook(phoneNumber, name, relation, age);
		boolean result = service.insert(Book);
		
		if(result == true) {
			System.out.println("## 저장이 완료되었습니다.");	
		} else {
			System.out.println("## 저장을 실패했습니다.");
		}
		
	}
	
	private void retrieve(){
		System.out.println("\n<< 등록 번호 조회 >>");
		String phoneNumber;
		
		System.out.print("# 조회 번호: ");
		phoneNumber = keyin.next();
		
		PhoneBook Book = service.selectOne(phoneNumber);
		
		
		if(Book == null){
			System.out.println("## 입력한 번호의 정보가 없습니다.\n");
			return;
		}
		System.out.println(Book);
	}
	
	private void update() {
		System.out.println("\n<< 등록 번호 수정 >>");
		String phoneNumber, relation, check;
		int age;
		
		System.out.print("# 전화번호: ");
		phoneNumber = keyin.next();
		
		PhoneBook Book = service.selectOne(phoneNumber);
		
		
		if(Book == null){
			System.out.println("## 입력한 번호의 정보가 없습니다.\n");
			return;
		}
		
		
		System.out.println("# 관계: ");
		relation = keyin.next();
		
		System.out.println("# 나이: ");
		age = keyin.nextInt();
		
		System.out.println("수정하시겠습니까? (y/n)");
		check = keyin.next();
		
		if(!(check.equals("Y")||check.equals("y"))) {
			System.out.println("수정이 취소되었습니다.");
			return;
		}
		
		Book.setRelation(relation);
		Book.setAge(age);
		
		boolean result = service.update(Book);
		
		if(result) {
			System.out.println("# 수정되었습니다.\n");
		} else {
			System.out.println("## 수정 실패하였습니다.");
		}
	}
	
	private void delete() {
		System.out.println("\n<< 등록 번호 삭제 >>");
		String phoneNumber, check;
		
		System.out.println("# 전화 번호: ");
		phoneNumber = keyin.next();
		
		PhoneBook Book = service.selectOne(phoneNumber);
		
		if(Book == null) {
			System.out.println("# 입력한 번호의 정보가 없습니다.");
			return;
		}
		
		System.out.println("삭제하시겠습니까? (y/n)");
		check = keyin.next();
		
		if(!(check.equals("Y") || check.equals("y"))) {
			System.out.println("삭제가 취소되었습니다.");
			return;
		}
		
		boolean result = service.delete(phoneNumber);
		if (result) {
			System.out.println("# 삭제되었습니다.");
		} else {
			System.out.println("## 삭제 실패하였습니다.");
		}
	}
	
	private void retriveAll() {
		System.out.println("\n <<전체 번호 조회>>");
		int count = service.getCount();
		
		if(count==0) {
			System.out.println("## 저장한 번호가 없습니다.");
			return;
		}
		
		PhoneBook[] list = service.selectAll();
		System.out.println("## 전체 등록 번호 수: " + count + "개");
		for(int i=0; i<count; ++i) {
			PhoneBook Book = list[i];
			System.out.println(list[i]);
		}
		
	}
	


}
