package com.javalab.sec01;
/**
 * 인터페이스
 * - 추상 메소드 묶음이다.
 * - 업무에대한 공통사항을 간추려놓고 인터페이스를 구현하는 클래스에서 구체적으로 기술하도록 강제하는 클래스
 * 인터페이스 구성요소
 * - 상수, 추상메소드, 디폴트메소드, 정적메소드
 */

public interface RemoteControl {
	/**
	 * 추상메소드
	 * - 메소드 앞에 public abstract가 붙는다.
	 */
	public abstract void turnOn();
	
	
}
