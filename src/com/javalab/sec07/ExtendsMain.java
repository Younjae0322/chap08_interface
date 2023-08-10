package com.javalab.sec07;

public class ExtendsMain {

	public static void main(String[] args) {
		// 구현 객체
		InterfaceCImpl impl = new InterfaceCImpl();
		
		// 부모 인터페이스 타입에 대입되면 InterfaceA 가 가진 
		// methodA만 호출 가능.
		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); //InterfaceB가 갖고 있어서 호출불가.
		System.out.println();
		
		// InterfaceB 타입에 대입되면 InterfaceB가 가진
		// methodB만 호출 가능.
		InterfaceB ib = impl;
		//ib.methodA(); //InterfaceA가 갖고 있어서 호출불가.
		ib.methodB();
		System.out.println();
		
		// InterfaceC를 구현했으므로 InterfaceC가 상속한
		// 모든 부모 인터페이스에 정의되어 있는 메소드 호출 가능.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}

}
