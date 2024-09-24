
public enum Season2 {
	봄("Spring", "FF", 1000), 여름("Summer", "SS", 1500), 가을("Fall", "FF", 2000), 겨울("Winter", "WW", 2500);
	
	// 자기 데이터를 자기가 받음  (일반적 클래스와 다름)
	private String data;
	private String temp;
	private int num;
	
	Season2(String data, String temp, int num) {      // 접근지정자 사용 불가
		this.data = data;
		this.temp = temp;
		this.num = num;
		System.out.println("계절: " + this);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
}
