
public class DupArray {

	public static void main(String[] args) {
		int[] array = { 50, 20, 30, 40, 70, 60, 50, 1, 40, 30 };

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
//				System.out.println("I " + i + " J " + j);
				if (array[i] == array[j]) {
					System.out.println("Dup Elem: " + array[i]);
				}

			}
		}

	}
}
