package com.javalab.sec01;

public class RemoteControlMain {
	/**
	 * main 메소드에서 인터페이스를 통해서 구현 클래스를 동작시킴
	 */

	public static void main(String[] args) {
		// 인터페이스 변수(참조타입) 선언
		RemoteControl rc;
		
		//rc 변수에 Television 객체를 대입
		rc = new Television();
		rc.turnOn();
		/**
		 * 인터페이스 타입 rc변수의 turnOn()메소드를
		 * 호출했지만 실제로는 rc에 대입된 구현객체가
		 * 오버라이딩한 메소드가 실행됨
		 */
		//rc 변수에 Audio 객체를 대입
		rc = new Audio();
		rc.turnOn();
	}

}
