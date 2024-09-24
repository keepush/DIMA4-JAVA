// 유지민

package vi;

import java.util.Scanner;

import service.CosmeticServiceImpl;
import vo.Foundation;
import vo.Lipstick;
import vo.Product;

public class CosmeticUI {
	Scanner keyin = new Scanner(System.in);
	CosmeticServiceImpl service = new CosmeticServiceImpl();
	
	public CosmeticUI() {
		String choice;
		
		while(true) {
			System.out.println("===[ 화장품 관리 ]===");
			System.out.println(" 1. 상품 등록 ");
			System.out.println(" 2. 상품 수정 ");
			System.out.println(" 3. 상품 삭제 ");
			System.out.println(" 4. 상품 조회 ");
			System.out.println(" 5. 전체 상품 조회 ");
			System.out.println(" 0. 종료");
			System.out.println("===============");
			System.out.print(" > 선택: ");
			
			choice = keyin.next();
			
			switch(choice) {
			case "1": insert(); break;
			case "2": update(); break;
			case "3": delete(); break;
			case "4": retrieve(); break;
			case "5": retrieveAll(); break;
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
		System.out.println("\n<< 상품 등록 >>");
		String productNo, name, check;
		int price;
		
		if(service.getCount() >= 50) {
			System.out.println("## 회원가입을 할 수 없습니다.");
			return;
		}
		
		System.out.print("1. 립스틱 / 2. 파운데이션: ");
		check = keyin.next();
		System.out.print("> 상품번호: ");
		productNo = keyin.next();
		
		if(service.selectOne(productNo) != null) {
			System.out.println("\n## 이미 등록된 상품입니다.\n");
			return;
		}
		
		System.out.print("> 상품명: ");
		name = keyin.next();
		System.out.print("> 상품가격: ");
		price = keyin.nextInt();
				
		switch(check) {
		case "1":{
			String type, color;
			System.out.print("> 립스틱 타입: (1. 립밤 / 2. 립글로스 / 3. 틴트) : ");
			type = keyin.next();
			System.out.print("> 립스틱 색상: (1. 빨강 / 2. 분홍 / 3. 오렌지) : ");
			color = keyin.next();
			
			Product product = new Lipstick(productNo, name, price, type, color);
			boolean result = service.insert(product);
			if (result) {
				System.out.println("\n## 상품이 등록되었습니다.\n");
			} else {
				System.out.println("\n## 상품 등록을 실패했습니다.\n");
			}
		} break;
		
		case "2":{
			String texture;
			System.out.print("> 파운데이션 제형: (1. 크림 / 2. 스틱)");
			texture = keyin.next();
			
			Product product = new Foundation(productNo, name, price, texture);
			boolean result = service.insert(product);
			if (result) {
				System.out.println("\n## 상품이 등록되었습니다.\n");
			} else {
				System.out.println("\n## 상품 등록을 실패했습니다.\n");
			}
		} break;
		}
	}
	
	
	
	private void update() {
		System.out.println("\n<< 상품 정보 수정 >>");
		String productNo;
		
		System.out.print("> 수정할 상품의 번호: ");
		productNo = keyin.next();
		Product product = service.selectOne(productNo);
		
		if(product == null) {
			System.out.println("\n## 상품이 존재하지 않습니다.\n");
			return;
		}
		
		System.out.println(product);
		System.out.println();
		
		if(product instanceof Lipstick) {
			String name, type, color;
			int price;
			
			System.out.print("> 상품명: ");
			name = keyin.next();
			System.out.print("> 상품가격: ");
			price = keyin.nextInt();
			System.out.print("> 립스틱 타입:(1.립밤 / 2. 립글로스 / 3. 틴트) : ");
			type = keyin.next();
			System.out.print("> 립스틱 색상:(1.빨강 / 2. 분홍 / 3. 오렌지) : ");
			color = keyin.next();
			
			Lipstick lipstick = (Lipstick)product;
			lipstick.setName(name);
			lipstick.setPrice(price);
			lipstick.setType(type);
			lipstick.setColor(color);
			boolean result = service.update(lipstick);
			System.out.println(product);
			if (result) {
				System.out.println("\n## 수정이 완료되었습니다.\n");
			}
			else {
				System.out.println("\n## 정보 수정을 실패했습니다.\n");
			}
			
		}
		else if (product instanceof Foundation) {
			String name, texture;
			int price;
			System.out.print("> 상품명: ");
			name = keyin.next();
			System.out.print("> 상품가격: ");
			price = keyin.nextInt();
			System.out.print("> 파운데이션 제형: (1. 크림 / 2. 스틱) : ");
			texture = keyin.next();
			
			Foundation foundation = (Foundation)product;
			foundation.setName(name);
			foundation.setPrice(price);
			foundation.setTexture(texture);
			boolean result = service.update(foundation);
			System.out.println(product);
			if (result) {
				System.out.println("\n## 수정이 완료되었습니다.\n");
			}
			else {
				System.out.println("\n## 정보 수정을 실패했습니다.\n");
			}
		}
		
		
		
	}
	
	
	
	private void delete() {
		String productNo, check;
		System.out.println("\n << 상품 삭제 >>");
		System.out.print("> 삭제할 상품의 번호: ");
		productNo = keyin.next();
		Product product = service.selectOne(productNo);
		
		if (product==null) {
			System.out.println("\n## 해당 상품이 없습니다.\n");
			return;
		}
		
		System.out.println(product);
		
		System.out.print("상품을 삭제 하시겠습니까? (y/n) ");
		check = keyin.next();
		if(!(check.equals("Y")||check.equals("y"))) {
			System.out.println("\n## 삭제가 중단되었습니다.\n");
			return;
		}
		boolean result = service.delete(productNo);
		if (result) {
			System.out.println("\n## 상품이 삭제되었습니다.\n");
		}
		else {
			System.out.println("## 삭제 실패");
		}
	}
	
	
	private void retrieve() {
		System.out.println("\n<< 상품 정보 수정 >>");
		String productNo;
		
		System.out.print("> 수정할 상품의 번호: ");
		productNo = keyin.next();
		
		Product product = service.selectOne(productNo);
		
		if (product == null) {
			System.out.println("## 상품이 존재하지 않습니다.\n");
			return;
		}
		System.out.println(product);
		System.out.println();
	}
	
	private void retrieveAll() {
		System.out.println("\n<< 전체 상품 조회 >>");
		int count = service.getCount();
		
		if(count == 0) {
			System.out.println("## 저장한 번호가 없습니다.");
			return;
		}
		
		Product[] list = service.selectAll();
		for(int i=0; i<count; ++i) {
			System.out.println(list[i]);
		}
		System.out.println();
	}
	
	
	
	
}
