package lesson4;

/**
 * @author liva
 */
public class ProgramLauncher {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 0; i < 5; i++) {
			PrintABC.print();
		}
		System.out.println(PrintABC.thread1.getState());
		System.out.println(PrintABC.thread2.getState());
		System.out.println(PrintABC.thread3.getState());


//		ThreadGroup threadGroup = new ThreadGroup("TG");
//
//		Thread thread1 = new Thread(threadGroup, new EventA());
//		Thread thread2 = new Thread(threadGroup, new EventB());
//		Thread thread3 = new Thread(threadGroup, new EventC());
//
//		thread1.setPriority(10);
//		thread2.setPriority(9);
//		thread3.setPriority(8);
//
//
//			thread1.start();
//			thread2.start();
//			thread3.start();
//


//		Object c = new Object();
//
//		synchronized (c) {
//
//			thread1.start();
//			c.wait(10);
//			thread2.start();
//			c.wait(10);
//			thread3.start();
//		}


//		ScheduledExecutorService threadpoll = new ScheduledThreadPoolExecutor(1, runnable -> {
//			Thread thread = new Thread(runnable);
//			return thread;
//		});
//
//		for (int i = 0; i < 5; i++) {
//			threadpoll.submit(new EventA());
//			threadpoll.submit(new EventB());
//			threadpoll.submit(new EventC());
//		}
//
//		threadpoll.shutdown();
	}
}
