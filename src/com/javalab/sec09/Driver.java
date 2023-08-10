package com.javalab.sec09;
/**
 * 드라이버 클래스로 dirve()메소드를 통해서 다형성 구현
 * - dirve()메소드의 매개변수로 어떤 구현 객체가 오느냐에
 *   따라서 해당 자식 구현 객체의 오버라이딩 메소드가 호출됨.
 */

public class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}

}
