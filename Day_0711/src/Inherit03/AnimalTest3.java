package Inherit03;
// 다형성
// 상속

public class AnimalTest3 {

	public static void main(String[] args) {
		Animal animal;
		
		animal = new Dog();
//		System.out.println(animal instanceof Cat);
//		System.out.println(animal instanceof Math);  //오류
		process(animal);
		
		animal = new Bird();
		process(animal);
		
		animal = new Cat();
		process(animal);
	}
	
	// 조금 있다가 쓸 예정
	public static void process(Animal animal) {
		// 부모의 추상메소드가 아닌 경우 다형성 처리가 어렵다!
		if (animal instanceof Cat)
			animal.setType("고양이");
		else if (animal instanceof Bird)
			animal.setType("참새");
		else if (animal instanceof Dog)
			animal.setType("강아지");
		
		animal.output();
		
		// cry() 메소드는 추상메소드라서 다형성 처리가 된다!
		animal.cry();
		System.out.println();
	}

}
