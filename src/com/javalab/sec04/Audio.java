package com.javalab.sec04;
/**
 * 구현클래스 
 */

public class Audio implements RemoteControl {
	//필드
	private int volume;
	
	//turnOn() 추상 메소드 오버라이딩
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
	
	//필드(볼륨을 기억하는 역할)
	private int memoryVolume;
	
	/**
	 * 디폴트 메소드 재정의
	 * - public 접근 제한자를 반드시 붙인다.
	 * - default 키워드를 생략해야 한다.
	 */
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			// 기존 볼륨을 기억(저장)시켜놓음
			this.memoryVolume = this.volume;
			System.out.println("오디오 볼륨을 무음 처리 합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		}else {
			System.out.println("오디오 볼륨을 무음에서 해제 합니다.");
			setVolume(this.memoryVolume);
			//mute가 false일 경우, 원래 볼륨으로 복원하는 코드
		}
	}
}
