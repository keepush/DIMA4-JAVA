package 시험;

public class Reader extends Man {
	private String name;

	public Reader() {
		super();
	}

	public Reader(String name) {
		super(name);
		this.name = name;
	}
	
	public String speak() {
		return name + " 독자는 자바를 잘 하고 싶다!!";
	}
	
}

