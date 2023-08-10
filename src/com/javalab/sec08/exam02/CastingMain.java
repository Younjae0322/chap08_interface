package com.javalab.sec08.exam02;

public class CastingMain {

	public static void main(String[] args) {
		/**
		 * 구현 객체를 생성해서 부모(인터페이스) 타입에 대입
		 * 인터페이스가 가진 추상 메소드만 호출 가능함.
		 */
		Vehicle vehicle = new Bus();
		
		//인터페이스를 통해서 호출
		vehicle.run();
		//vehicle.checkFare(); //x
		
		/**
		 * 인터페이스 타입에 들어갔던 구현 객체를 다시 꺼내서
		 * 구현객체(자식) 타입으로 강제 형변환하면 자식이 갖고 있는
		 * 모든 메소드를 호출 할 수 있게 된다.
		 */
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
				
	}

}
