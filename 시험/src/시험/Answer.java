package 시험;

import java.util.Scanner;

class Man{
	 private String name;

	 public Man(String name) {
		      this.name = name;
		   }

		   public String getName() {
		      return name;
		   }   
		   
		}

// interface
interface Speakable {
	public String speak();
}

//Student
class Student extends Man{
 //기본생성자 -> 부모생성자
	public Student(String name) {
		super(name);
		   }
}

//Reader
class Reader extends Man implements Speakable{
	public Reader(String name) {
		super (name);
	}
	
	@Override
	public String speak() {
		return super.getName() + "독자는 자바를 잘하고 싶다";
	}
}


//Worker
class Worker extends Man implements Speakable{
	public Worker(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		return super.getName() + "일꾼은 자기가 맡은 일을 잘하고 싶다";
	}
}


public class Answer {

 public static void main(String[] args) {
	 Scanner keyin = new Scanner(System.in);
	 Speakable[] man = new Speakable[2];  // 두 명의 정보를 저장
	 String choice, name;
	 
	 System.out.println("Speak 등록 메인메뉴입니다. 단 2명만 등록할 수 있습니다.");
	 System.out.println("어떤 Speaker를 등록하는지 선택하세요.");
	 
	 
	 for(int i=0; i<man.length; ++i) {
		 System.out.println("1. Reader 등록");
		 System.out.println("2. Worker 등록");
		 System.out.println("선택: ");
		 choice = keyin.next();
		 
		 System.out.println("이름을 입력하세요: ");
		 name = keyin.next();
		 
		 switch(choice) {
		 case "1" : 
			 man[i] = new Reader(name);
			 break;
		 case "2" :
			 man[i] = new Worker(name);
			 break;
		 } 
	 } // 입력 완료
	 
	 // 출력
	 for(int i =0; i<man.length; ++i) {
		 System.out.println(man[i].speak());
	 }
	}

}



