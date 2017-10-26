package threadtest;

public class HelloRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + Thread.currentThread().getName());
		}
		System.out.println("Hello from a thread!");
	}
}
