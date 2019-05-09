package lesson5;

import java.util.concurrent.CyclicBarrier;

/**
 * @author liva
 */

public class Car implements Runnable {

	private static int CARS_COUNT;

	static {
		CARS_COUNT = 0;
	}

	private Race   race;
	private int    speed;
	private String name;
	private CyclicBarrier barrierWait;
	private CyclicBarrier barrierGo;

	public String getName() {
		return name;
	}

	public int getSpeed() {
		return speed;
	}

	public Car(Race race, int speed, CyclicBarrier barrierWait, CyclicBarrier barrierGo) {
		this.race = race;
		this.speed = speed;
		CARS_COUNT++;
		this.name = "Участник #" + CARS_COUNT;
		this.barrierWait = barrierWait;
		this.barrierGo = barrierGo;
	}

	@Override
	public void run() {
		try {
			System.out.println(this.name + " готовится");
			barrierWait.await();
			Thread.sleep(500 + (int) (Math.random() * 800));
			System.out.println(this.name + " готов");
			barrierGo.await();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		for (int i = 0; i < race.getStages().size(); i++) {
			race.getStages().get(i).go(this);
		}
	}
}
