package com.javalab.sec09;

public class DriverMain {

	public static void main(String[] args) {
		//Driver 객체 생성
		Driver driver = new Driver();
		
		//Vehicle 구현 객체 생성;
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Truck truck = new Truck();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(truck);
		System.out.println();
		
		Vehicle[] arr = {bus,taxi,truck};
		for(Vehicle vehicle : arr) {
			vehicle.run();
		}
		
	}

}
