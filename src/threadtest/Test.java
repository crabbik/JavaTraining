package threadtest;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		final HelloThread helloThread = new HelloThread();

		// helloThread.setDaemon(true);
		helloThread.start();

		// helloThread.run();
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 20; i++) {
					if (i == 5) {
						try {
							helloThread.join();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i + Thread.currentThread().getName());
				}

			}
		});
		// thread.setDaemon(true);

		thread.start();

		// thread.run();
		// Thread.sleep(1000);

	}
}
