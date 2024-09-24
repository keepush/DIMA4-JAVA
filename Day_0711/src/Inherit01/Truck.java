// public, protected 멤버만 상속
// private은 상속되지 않음.  단! 상속받은 public 메소드인 setter, getter를 통해 부모의 private 멤버에 접근 가능
// 생성자도 상속이 안 됨
package Inherit01;

public class Truck extends Vehicle {
	private int maxLoad;

	public Truck() {
		super();		// 부모의 기본 생성자를 호출해서 부모부터 생성, 모든 코드보다 위에 있어야 함
	}
	
	public Truck(int maxLoad) {
		super();
		this.maxLoad = maxLoad;
	}

	public Truck(int maxLoad, int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.maxLoad = maxLoad;
	}
// 부모 것 setter, getter, output()이 종속되어 있음
// 자식 것
	public int getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	public void outputTruck() {
		this.output();
		System.out.println("Truck=" + maxLoad);
	}
}
