package com.javalab.sec0301;

public class WearableMain {

	public static void main(String[] args) {
		Wearable wearable;
		
		HeadPhone hp = new HeadPhone();
		wearable = hp;
		wearable.putOn();
		wearable.putOff();
		
		GoogleGlasses gl = new GoogleGlasses();
		wearable = gl;
		wearable.putOn();
		wearable.putOff();
		
		Wearable[] wearables = {hp, gl};
		for(Wearable wb : wearables) {
			wb.putOn();
			wb.putOff();
		}
		
	}

}
