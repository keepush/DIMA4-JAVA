package point_rectangle;

public class Rectangle extends Point{
	private int width;
	private int weight;

	public Rectangle() {
		super();
	}
	
	public Rectangle(int width, int weight) {
		super();
		this.width = width;
		this.weight = weight;
	}

	public Rectangle(int x, int y, int width, int weight) {
		super(x, y);
		this.width = width;
		this.weight = weight;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void print() {
		super.print();
		System.out.printf("width = %d, height = %d, area = %.2f%n", width, weight, area());
	}

	@Override
	public double area() {
		return width * weight;
	}
	
	
	
}
