package com.ss.mod4;

public class Mod_4_assignment_1 {
	
	private volatile static Mod_4_assignment_1 instance;
	
	private Mod_4_assignment_1() {};
	
	public static Mod_4_assignment_1 getInstance() {
		
		if (instance == null) {
			synchronized (Mod_4_assignment_1.class) {
				if(instance == null) {
					instance = new Mod_4_assignment_1();
				}
			}
		}
		
		return instance;
		
	}

}
