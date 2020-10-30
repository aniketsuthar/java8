import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Prime {

	int array[];

	public void checkPrime(int a, int... b) {
		array = new int[b.length + 1];
		if (a != 1) {
			if (Math.sqrt(a) % 2 == 0 && a != 2) {
			} else {
				array[0] = a;
			}
		}

		for (int j = 2; j < b.length; j++) {
			if (b[j] != 1) {
				if (Math.sqrt(b[j]) % j == 0 && b[j] != 2) {
				} else {
					array[j + 1] = b[j];
				}
			}

		}

		for (int k : array) {
			if (k != 0)
				System.out.print(k + " ");
		}
		System.out.println();
	}
}

public class PrimeNumberExample {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
