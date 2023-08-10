package com.javalab.sec03;

public interface RemoteControl {
	//상수 필드(public static final)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드(public abstract, public 접근제한)
	// 이 메소드를 오버라이드 하는 구현 객체는 반드시
	// 해당 메소드의 접근제한을 public으로 해야함.
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	

}
