package Inherit02;

public class InheritTest {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.setMoney(150000);
		System.out.println();
		
		parent.output();
		System.out.println();

		Child child = new Child(17500);
		child.output();
		System.out.println();
		
		// ----
		Child son = new Child(20000);  // 아들이 번 돈
		son.setMoney(15000);   //부모가 남겨준 돈
		son.output();
	}

}
