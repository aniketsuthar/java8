package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class AtomicIntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = new Counter();
		ExecutorService service = Executors.newFixedThreadPool(10);
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		Callable<Integer> callable = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int v = counter.increment();
				System.out.println("Value " + v);
				return v;
			}
		};
		for (int i = 0; i < 10; i++) {
			list.add(service.submit(callable));

		}

		service.shutdown();

		while (!service.isTerminated()) {
		}
		System.out.println("Service Terminated ? " + service.isTerminated());

		list.stream().collect(Collectors.toSet()).forEach(e -> {
			try {
				System.out.println("Set" + e.get());
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		list.stream().forEach(e -> {
			try {
				System.out.println("List" + e.get());
			} catch (InterruptedException | ExecutionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		int nThreads = Runtime.getRuntime().availableProcessors();
		long MB = 1024L * 1024L;
		long freemem = Runtime.getRuntime().freeMemory();

		long mem = freemem / MB;
		System.out.println("Free memory before gc " + mem);
		Runtime.getRuntime().gc();
		long memgc = Runtime.getRuntime().freeMemory() / MB;
		System.out.println("Free memory after gc " + memgc);

		System.out.println("Threads " + nThreads);
		System.out.println(Runtime.getRuntime().maxMemory() / MB);
		System.out.println(Runtime.getRuntime().totalMemory() / MB);
		Runtime.getRuntime().runFinalization();
		long memgc1 = Runtime.getRuntime().freeMemory() / MB;
		System.out.println("Freed memory " + memgc1);
	}

}
