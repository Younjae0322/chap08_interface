package com.javalab.sec01;
/**
 * 구현클래스
 */

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

}
