package threadtest2;

public class Counter {
	public synchronized void count() {

		try {
			System.out.println(String.format("%s пошел спать", Thread
					.currentThread().getName()));
			Thread.sleep(2000);
			System.out.println(String.format("%s проснулся", Thread
					.currentThread().getName()));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
