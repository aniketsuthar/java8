
public class Queue {
	private int[] queueArray;
	private int rear;

	public Queue(int size) {
		queueArray = new int[size];
	}

	public void put(int n) {
		if (rear == queueArray.length) {

		} else {
			queueArray[rear] = n;
			rear++;
		}
	}

	public int get() {
		int n = queueArray[0];
		for (int i = 0; i < rear - 1; i++) {
			queueArray[i] = queueArray[i + 1];
		}
		return n;
	}

	public void displayQueue() {
		for (int j = 0; j < queueArray.length; j++) {
			System.out.print(queueArray[j] + " ");
		}

	}

	public static void main(String[] args) {
		Queue q = new Queue(10);
		q.put(10);
		q.put(9);
		q.put(8);
		q.put(7);
		q.put(6);
		q.put(5);
		q.displayQueue();
		System.out.println("GET call " + q.get());
		q.displayQueue();
		System.out.println("GET call " + q.get());
		q.displayQueue();
	}
}
