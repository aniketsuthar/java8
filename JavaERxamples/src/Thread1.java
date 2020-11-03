class Thread1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++)
			print();
	}

	synchronized void print() {
		System.out.println("Print:" + getName());
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