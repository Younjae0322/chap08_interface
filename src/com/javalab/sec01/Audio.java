package com.javalab.sec01;
/**
 * 구현(implement) 클래스
 * - 선언 형태 : 클래스 뒤에 "implements 인터페이스명"과 같은 형태 
 */

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

}
