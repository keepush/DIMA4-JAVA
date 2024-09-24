package Inherit01;

public class VehivleMain {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle(4, 4, 500.5);
		vehicle.output();
		System.out.println();
		
		Truck truck = new Truck(10);
		truck.outputTruck();
		System.out.println();
		
		Truck truck2 = new Truck(15, 6, 8, 15000);
		truck2.outputTruck();
		System.out.println();
		
		// 버스객체 생성하기
		Bus bus = new Bus("365");
		bus.outputBus();
		System.out.println();
		
		Bus bus2 = new Bus("150", 4, 25, 20000);
		bus2.outputBus();
		System.out.println();
		
		// 세단
		Sedan sedan = new Sedan(true);
		sedan.outputSedan();
		System.out.println();
		
		Sedan sedan2 = new Sedan(true, 4, 5, 15000);
		sedan2.outputSedan();
		System.out.println();
	}
}
