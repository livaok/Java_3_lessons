package lesson4;

import java.util.concurrent.*;

/**
 * @author liva
 */
public class ProgramLauncher {

	public static void main(String[] args) {

		ScheduledExecutorService threadpoll = new ScheduledThreadPoolExecutor(1, runnable -> {
			Thread thread = new Thread(runnable);
			return thread;
		});

		for (int i = 0; i < 5; i++) {
			threadpoll.submit(new EventA());
			threadpoll.submit(new EventB());
			threadpoll.submit(new EventC());
		}

		threadpoll.shutdown();
	}
}
