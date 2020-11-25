package com.java.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomExceptionSubclass extends CustomException {

	@Override
	public int add(int a, int b) throws FileNotFoundException {

		return (a + b);

	}

	public static void main(String[] args) {
		CustomExceptionSubclass ce = new CustomExceptionSubclass();

		try {
			ce.add(5, 10);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ce = null;
		System.gc();

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("In filize");
	}
}
