package 시험;

public class Worker extends Man {
	private String name;

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name) {
		super(name);
		this.name = name;
	}
	
	public String speak() {
		return name + " 일꾼은 자기가 맡은 일을 열심히 한다!!";
	}
	
}
