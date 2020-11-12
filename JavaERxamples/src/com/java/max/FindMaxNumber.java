package com.java.max;

import java.util.Scanner;

public class FindMaxNumber {
	public static int findNewNum(int X) {

		String s = String.valueOf(X);
		char[] a = s.toCharArray();
		int tmp = 0;
		char[] newarry = new char[a.length];
		int[] num = new int[2];
		int count = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 1; j < a.length; j++) {
				if (Integer.parseInt(String.valueOf(a[i])) > Integer.parseInt(String.valueOf(a[j]))) {
					tmp = Integer.parseInt(String.valueOf(a[j]));
					a[j] = a[i];
					a[i] = String.valueOf(tmp).charAt(0);
				} else if (Integer.parseInt(String.valueOf(a[i])) < Integer.parseInt(String.valueOf(a[j]))) {
					tmp = Integer.parseInt(String.valueOf(a[i]));
					a[i] = a[j];
					a[j] = String.valueOf(tmp).charAt(0);
				}
			}
		}

		System.out.println(a);
		return X;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int j = findNewNum(s.nextInt());
//		System.out.println(j);

	}

}
