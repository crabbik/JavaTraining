package threadtest2;

public class Test {

	public static void main(String[] args) {
		final Counter counter = new Counter();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				counter.count();
			}

		});
		t1.start();
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				counter.count();
			}

		});
		t2.start();

	}

}
