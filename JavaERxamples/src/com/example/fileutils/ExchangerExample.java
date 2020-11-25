package com.example.fileutils;

import java.util.Deque;
import java.util.concurrent.Exchanger;
import java.util.concurrent.LinkedBlockingDeque;

public class ExchangerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exchanger<Deque<Long>> queue = new Exchanger<Deque<Long>>();
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Deque<Long> q = new LinkedBlockingDeque<Long>();
				long time = System.nanoTime() / 1000;
				System.out.println("Time at Prod: " + time);
				q.add(time);
				System.out.println(q);
				try {
					System.out.println("Received from revceiver: " + queue.exchange(q));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				Deque<Long> q = new LinkedBlockingDeque<Long>();
				long time = System.nanoTime() / 1000;
				System.out.println("Time at Receiver: " + time);
				q.add(time);
				System.out.println(q);
				// TODO Auto-generated method stub
				try {
					System.out.println("Received From Prod: " + queue.exchange(q));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		producer.start();
		consumer.start();

	}

}
