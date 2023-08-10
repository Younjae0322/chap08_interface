package com.javalab.sec04;

public class RemoteControlMain {

	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입.
		rc = new Televison();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);  //텔레비전에 디폴트 메소드가 들어와있다.
		rc.setMute(false);
		
		System.out.println();
		//Audio 객체를 생성하고 인터페이스 변수에 대입.
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		
	
	}

}
