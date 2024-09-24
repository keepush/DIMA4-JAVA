package Exam;

public class ChickenTest {
	public static void main(String[] args) {
		Chicken chicken;
		
		chicken = new FriedChicken();
		process(chicken);
		
		chicken = new SeasonedChicken();
		process(chicken);
	}
	
	public static void process(Chicken chicken) {
		chicken.cook();
	}
	
	// process에서 cook을 호출하면 -> 부모인 Chicken.java의 cook을 가져오는데 내용이 없음
	// -> 자식에 각각 해당하는 자식으로 내려가서 cook 가져옴 ("튀긴다.", "양념을 바른다.")

}
