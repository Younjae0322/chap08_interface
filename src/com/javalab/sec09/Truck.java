package com.javalab.sec09;
/**
 * 트럭 구현 클래스
 */

public class Truck implements Vehicle{
	//메소드 재정의 (오버라이딩)
	@Override
	public void run() {
		System.out.println("트럭이 화물을 싣고 달립니다.");
	}

}
