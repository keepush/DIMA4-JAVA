package fitnessManage;
/*
 * 	이름(name), 키(height), 몸무게(weight), 성별(gender)
 */
public class FitnessV0 {
	private String name;
	private double height, weight;
	private String gender;
	
	// setter 
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
}
