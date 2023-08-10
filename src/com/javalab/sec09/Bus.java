package com.javalab.sec09;
/**
 * 버스 구현 클래스
 */

public class Bus implements Vehicle{
	//추상 메소드 재정의
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

}
