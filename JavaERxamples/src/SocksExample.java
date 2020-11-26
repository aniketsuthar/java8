import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SocksExample {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int counter = 0;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (ar[i] == ar[j]) {
					if (!map.containsKey(ar[i]))
						map.put(ar[i], counter++);
					else {
						int v = map.get(ar[i]);
						v++;
						map.put(ar[i], v);
					}

				}
				counter = 0;

			}

		}
		Set<Map.Entry<Integer, Integer>> entry = map.entrySet();
		for (Entry e : entry) {
			int value = (int) e.getValue();
			if (value % 2 != 0) {
				value -= 1;
				map.put((int) e.getKey(), value);
			}

		}
		System.out.println("Print " + map);
		int r = map.entrySet().stream().collect(Collectors.summingInt(x -> x.getValue()));
		int f = r / 2;
		System.out.println(f);
		int finalPairs = 0;
		if (f % 2 == 0)
			finalPairs = f;
		else
			finalPairs = (f / 2) + 1;
//		f = (f % 2) == 0 ? (f) : ((f / 2) + 1);
		return f;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int c[] = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
//		int c[] = { 1, 1, 3, 1, 2, 1, 3, 3, 3, 3 };

//		System.out.println(sockMerchant(ar.length, ar));

		Set<Integer> colors = new HashSet<>();
		int pairs = 0;

		for (int i = 0; i < c.length; i++) {
			if (!colors.contains(c[i])) {
				colors.add(c[i]);
			} else {
				pairs++;
				colors.remove(c[i]);
			}
		}

		System.out.println(pairs);

	}
}
