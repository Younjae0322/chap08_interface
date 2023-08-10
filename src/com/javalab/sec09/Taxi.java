package com.javalab.sec09;
/**
 * 택시 구현 클래스
 */
public class Taxi implements Vehicle{
	//추상 메소드 재정의
	@Override
	public void run() {
		System.out.println("택시가 거리에서 손님을 태우고 운행중입니다.");
	}

}
