import java.util.Scanner;

public class Solution {
	private static int B;
	private static int H;
	static boolean flag = false;
	static {
		Scanner sc = new Scanner(System.in);
		try {
			B = sc.nextInt();
			H = sc.nextInt();

			if (B <= 0 || H <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			} else {
				flag = true;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

}// end of class
