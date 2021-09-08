package com.ss.mod4;

import java.util.LinkedList;
import java.lang.Thread;

public class Mod_4_assignment_3 {

	public static void main(String[] args) throws InterruptedException {

		final Ints ints = new Ints();

		Thread t1 = new Thread(){

			@Override
			public void run() {

				try {
					ints.make();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					ints.use();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

	public static class Ints {

		LinkedList<Integer> list = new LinkedList<>();
		int capacity = 5;

		public void make() throws InterruptedException {

			int value = 0;
			while (true) {
				synchronized (this) {

					while (list.size() == capacity)
						wait();

					System.out.println("Ints has made : " + value);

					list.add(value++);

					notify();

					Thread.sleep(1000);
				}
			}
		}

		public void use() throws InterruptedException {

			while (true) {
				synchronized (this) {

					while (list.size() == 0)
						wait();

					int take = list.removeFirst();

					System.out.println("Ints took : " + take);

					notify();

					Thread.sleep(1000);
				}
			}
		}

	}

}
