package Inherit03;
// 부모 클래스가 추상 클래스이면, 자식도 추상 클래스가 된다.
// Concrete 클래스가 되려면 상속받은 추상 메소드를 반드시! 오버라이드 해야 한다.
public class Cat extends Animal {

	@Override
	public void cry() {
		System.out.println("야옹");
	}
	
}
