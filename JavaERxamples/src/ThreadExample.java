
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t = new Thread1();
		t.setName("Thread-1");
		Thread1 t2 = new Thread1();
		t2.setName("Thread-2");

//		t.run();
//		t2.run();
		t.start();
		t2.start();
		System.out.println(t.add(20, 20));

	}

}
