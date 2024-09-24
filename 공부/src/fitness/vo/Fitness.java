package fitness.vo;
//아이디(PK), 이름, 성별, 키, 몸무게, 표준체중, BMI, BMI결과
public class Fitness {
	private int id;
	private String name;
	private String gender;
	private double height;
	private double weight;
	private double StdWeight;
	private double bmi;			// getter만
	private String bmiResult;   // getter 만
	
	public Fitness() {
	}

	public Fitness(int id, String name, String gender, double height, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;

		calcStdWeight();
		calcBMI();
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		calcStdWeight();
		calcBMI();
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
		calcStdWeight();
		calcBMI();
	}

	public double getSteWeight() {
		return StdWeight;
	}

	public void setSteWeight(double StdWeight) {
		this.StdWeight = StdWeight;
	}
	
	

	public double getBmi() {
		return bmi;
	}

	public String getBmiResult() {
		return bmiResult;
	}

	private void calcStdWeight() {
		double temp = height / 100;
		
		if(gender.equals("남")) {
			StdWeight = temp * temp * 22;
		} else {
			StdWeight = temp * temp * 21;
		}
		
	}
	
	private void calcBMI() {
		double temp = height / 100;
		
		bmi = weight / (temp * temp);
		calcBmiResult();
		
	}
	
	private void calcBmiResult() {
		if (bmi >= 35) {
			bmiResult = "고도 비만";
		} else if (bmi >= 30 ) {
			bmiResult = "중도 비만 (2단계 비만)";
		} else if (bmi >= 25) {
			bmiResult = "경도 비만 (1단계 비만)";
		} else if (bmi >= 23 ) {
			bmiResult = "과체중";
		} else if (bmi >= 18.5) {
			bmiResult  = "정상";
		} else {
			bmiResult = "저체중";
		}
	}

	@Override
	public String toString() {
		String data = String.format("%2d %s %s %.2fcm %.2fKg 표준체중: %.2f BMI: %.2f %s%n", id, name, gender, height, weight, StdWeight, bmi, bmiResult);
		return data;
	}

	
	
	
	
	
	
}
