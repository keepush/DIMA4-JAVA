package myenum;

public class WeatherTest {

	public static void main(String[] args) {
		Weather[] tmep = Weather.values();
		for(Weather t : tmep) {
			System.out.println(t + "(" + t.eng + ")");
			System.out.println("할 일 : " + t.todo());
			System.out.println("놀 일 : " + t.play());
			System.out.println();
		}

	}

}
