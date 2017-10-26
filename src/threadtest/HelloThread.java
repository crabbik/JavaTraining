package threadtest;

public class HelloThread extends Thread {

	public HelloThread() {
		super("Поток 1");
	}

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
