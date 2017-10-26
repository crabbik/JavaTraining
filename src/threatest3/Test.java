package threatest3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {

	public static void main(String[] args) {

		final ScheduledExecutorService scheduler = Executors
				.newScheduledThreadPool(2);
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Прошло 10 секунд");

			}
		};
		scheduler.scheduleAtFixedRate(runnable, 1, 10, TimeUnit.SECONDS);

	}

}
