package lesson5;

import java.util.concurrent.CyclicBarrier;

/**
 * @author liva
 */

public class MainClass {

	public static final int CARS_COUNT = 4;

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(CARS_COUNT, new RaceConditionTask());

		System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");

		Race race = new Race(new Road(60), new Tunnel(), new Road(40));
		Car[] cars = new Car[CARS_COUNT];

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(race, 20 + (int) (Math.random() * 10), barrier);
		}

		for (Car car : cars) {
			new Thread(car).start();
		}
	}

	private static class RaceConditionTask implements Runnable {

		private int state;

		@Override
		public void run() {
			if (state == 1) {
				System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
			}
			if (state == 2) {
				System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
			}
			state++;
		}
	}
}