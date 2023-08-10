package com.javalab.sec02;
/**
 * 상수를 멤버 변수로 갖음.
 * - 자동으로 public static final이 붙음(생략하면 자동추가)
 * - 상수는 인터페이스 구현 객체와 전혀 관계 없는 인터페이스
 * 소속 멤버로 인터페이스 이름으로 점찍고 바로 접근해서 읽을 수 있음.
 */

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	/**
	 * 접근 제한자가 없어서 default 접근제한자로 생각하기 쉽지만
	 * 앞에 public static final이 붙어서 public 접근 제한임.
	 */
	int MIN_VOLUME = 0;

}
