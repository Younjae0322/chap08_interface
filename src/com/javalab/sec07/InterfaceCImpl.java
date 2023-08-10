package com.javalab.sec07;
/**
 * 자식 인터페이스인 InterfaceC 구현 클래스
 * - InterfaceC를 포함하여 InterfaceA,
 *   InterfaceB가 가진 모든 추상 메소드를 오버라이드 해야함.
 */

public class InterfaceCImpl implements InterfaceC{
	// InterfaceA
	@Override	
	public void methodA() {
		System.out.println("InterfaceCImpl-methodA() 실행");
	}
	// InterfaceB
	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl-methodB() 실행");
	}
	// InterfaceC
	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl-methodC() 실행");
	}

	}

