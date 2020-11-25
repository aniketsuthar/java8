
public class DuplicateElementInArray {

	public static void printDupElem(int array[]) {
		int j = 0;
		for (int i = 0; i < array.length- 1; i++) {
			if (array[i] != array[i + 1]) {
				array[j++] = array[i];
			} else {
				System.out.println(array[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] array = { 30, 20, 30, 40, 70, 60 ,50};

		
		
		printDupElem(array);

	}
}
