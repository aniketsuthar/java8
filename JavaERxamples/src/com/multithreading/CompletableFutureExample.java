package com.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
	public static CompletableFuture<Integer> createCompletableFututre() {
		return CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
				for (int i = 0; i < 5; i++)
					System.out.println("I " + i);
			} catch (InterruptedException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 20;

		});
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("Started Main Thread");
		CompletableFuture<String> cf = createCompletableFututre().thenApply((Integer e) -> {
			int t = e * 10;
			return t;
		}).thenApply(t -> " Converted to String " + t);
		System.out.println("After finishing Task");
		try {

			System.out.println("Result " + cf.get());
		} catch (InterruptedException | ExecutionException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
