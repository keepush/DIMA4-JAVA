package point_rectangle;

import java.util.Scanner;

public class PointTest {
	
	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		Point[] polygon = new Point[50];
		
		int count=0;
		String choice;
		
		while(true) {
			System.out.print("\n1. 원   2. 사각형   3. 전체 출력    0. 종료 ==> ");
			choice = keyin.next();
			
			switch(choice) {
			case "1" : {
				System.out.println("x => ");
				int x = keyin.nextInt();
				System.out.println("y => ");
				int y = keyin.nextInt();
				System.out.println("radius => ");
				double radius = keyin.nextInt();
				
				polygon[count++] = new Circle(x, y, radius);
				break;
			}
			case "2" : {
				System.out.println("x => ");
				int x = keyin.nextInt();
				System.out.println("y => ");
				int y = keyin.nextInt();
				System.out.println("width => ");
				int width = keyin.nextInt();
				System.out.println("height => ");
				int height = keyin.nextInt();
				
				polygon[count++] = new Rectangle(x, y, width, height);
				
				break;
			}
			case "3" : {
				for(int i=0; i<count; ++i) {
					polygon[i].print();
				}
				break;
			}
			case "0" : {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
			default : 
				System.out.println("메뉴 선택을 다시 해 주세요");
			}
		}
	}

}
