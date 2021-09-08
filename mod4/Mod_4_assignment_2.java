package com.ss.mod4;

import com.ss.mod2.Rectangle;

public class Mod_4_assignment_2 {

	public static void main(String[] args) {
		
		Rectangle rec1 = new Rectangle(12,9);
		Rectangle rec2 = new Rectangle(9,12);
		
		ThreadImp t1 = new ThreadImp() {
			
			@Override
			public void run() {
				try {
					synchronized(rec1) {
						
						Thread.sleep(100);
						synchronized(rec2) {
							System.out.println("Thread one is running");
						}
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		ThreadImp t2 = new ThreadImp() {
			
			@Override
			public void run() {
				try {
					synchronized(rec2) {
						
						Thread.sleep(100);
						synchronized(rec1) {
							System.out.println("Thread two is running");
						}
						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		
		System.out.println("This is the end of the deadlock assignment");

	}

}
