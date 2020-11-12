package com.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private AtomicInteger c = new AtomicInteger();

	public int increment() {
		return c.incrementAndGet();
	}

	public int getValue() {
		return c.get();
	}

}
