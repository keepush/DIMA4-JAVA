package Inherit03;
// 다형성
// 상속

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal animal;
		animal = new Dog();
		animal.setType("개의 종류");
		animal.output();
		animal.cry();    // (동적 바인딩) 부모의 메소드가 추상이면 자식의 메소드를 찾아가는 것
		
		animal = new Bird();
		animal.setType("새의 종류");
		animal.output();
		
		animal = new Cat();
		animal.setType("고양이의 종류");
		animal.output();
		
// 		Animal animal = New Animal();  // 객체 생성 불가
		Dog dog = new Dog();
		dog.setType("포유류");
		dog.output();
		dog.cry();   // 멍멍
		
		System.out.println();
		
		Bird bird = new Bird();
		bird.setType("조류");
		bird.output();
		bird.cry();

		System.out.println();
		Cat cat = new Cat();
		cat.setType("포유류");
		cat.output();
		cat.cry();
	}
	
	// 조금 있다가 쓸 예정
	public static void process() {
		
	}

}
