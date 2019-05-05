package lesson4;

/**
 * @author liva
 */
class PrintABC {

	static Thread thread1;
	static Thread thread2;
	static Thread thread3;
	static Object c;

	static void print() throws InterruptedException {
		thread1 = new Thread(new EventA());
		thread2 = new Thread(new EventB());
		thread3 = new Thread(new EventC());
		c = new Object();

		synchronized (c){
			thread1.start();
			c.wait(10);
			thread2.start();
			c.wait(10);
			thread3.start();
		}
	}
}
