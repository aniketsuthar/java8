class Thread1 extends Thread {

	@Override
	public void run() {
		getAllStackTraces().entrySet().forEach(System.out::println);

		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
			try {
//				print(i);
				synchronizedPrintMethod(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void print(int i) throws InterruptedException {
		synchronized (this) {
			System.out.println("Print:" + getName() + " " + i);

		}
		for (int j = 0; j < 100; j++) {
			System.out.println(j);
		}

	}

	public synchronized void synchronizedPrintMethod(int i) throws InterruptedException {
		System.out.println("synchronizedPrintMethod:" + getName() + " " + i);
		for (int j = 0; j < 100; j++) {
			System.out.println(j);
		}
	}

	public int add(int a, int b) {
		return a + b;
	}

//	public int add(int a, int b) throws IOException {
//		return a + b;
//	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(double a, double b, double c) {
		return a + b + c;
	}
}