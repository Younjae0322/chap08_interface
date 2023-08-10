package com.javalab.sec05;
/**
 * 정적 메소드를 갖는 인터페이스
 * - 구현 객체가 없어도 인터페이스 이름만으로 접근가능.
 * - 선언 방법은 클래스의 정적메소드와 동일하다.
 * - public을 생략해도 컴파일러가 자동으로 붙여줌.
 */
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
	
	/**
	 * 무음처리 디폴트 메소드
	 * - 디폴트 메소드는 기존에 해당 인터페이스를 구현한
	 * 	 구현 클래스들을 계속 사용하면서 인터페이스에 기능을 추가하는 방법이다.
	 * - 디폴트 메소드가 나오기 전에는 인터페이스를 수정하게 되면
	 *   구현 클래스들의 코드를 모두 수정해야 했다.
	 */
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리 합니다.");
			//추상 메소드를 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 해제 합니다.");
		}
		
	}
	//정적 메소드 호출
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
		
	}

}
