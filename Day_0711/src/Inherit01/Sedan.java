package Inherit01;

public class Sedan extends Vehicle {
	private boolean trunk;

	public Sedan() {
		super();
	}

	public Sedan(boolean trunk) {
		super();
		this.trunk = trunk;
	}

	public Sedan(boolean trunk, int numberOfWheel, int numberOfSeat, double weight) {
		super(numberOfWheel, numberOfSeat, weight);
		this.trunk = trunk;
	}

	public boolean isTrunk() {
		return trunk;
	}

	public void setTrunk(boolean trunk) {
		this.trunk = trunk;
	}
	
	public void outputSedan() {
		this.output();
		System.out.println("Sedan Trunk= " + trunk);
	}
	
}
