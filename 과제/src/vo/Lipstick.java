// 유지민

package vo;

public class Lipstick extends Product {
	private String type;
	private String color;
	
	public Lipstick() {
		super();
	}


	public Lipstick(String productNo, String name, int price, String type, String color) {
		super(productNo, name, price);
		this.type = type;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		String temp1=null;
		String temp2=null;
		if (type.equals("1")) {
			temp1 = "립밤";
		}
		else if (type.equals("2")) {
			temp1 = "립글로스";
		}
		else {
			temp1 = "틴트";
		}
		
		if(color.equals("1")) {
			temp2 = "빨강";
		}
		else if (color.equals("2")) {
			temp2 = "분홍";
		} else {
			temp2 = "오렌지";
		}
		
		return super.toString() + ", 립스틱 타입 = " + temp1 + ", 색상=" + temp2;
	}
	
	
}
