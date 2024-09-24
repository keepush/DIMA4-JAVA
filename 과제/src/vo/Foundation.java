// 유지민

package vo;

public class Foundation extends Product {
	private String texture;

	public Foundation() {
		super();
	}

	public Foundation(String productNo, String name, int price, String texture) {
		super(productNo, name, price);
		this.texture = texture;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	@Override
	public String toString() {
		String temp=null;
		if (texture.equals("1")) {
			temp="크림";
		} else {
			temp = "스틱";
		}
		return super.toString() + ", 파운데이션 제형 = " + temp;
	}
	
	
}
