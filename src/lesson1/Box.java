package lesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liva
 */
public class Box<T extends Fruit> {

	private List<T> fruits;

	public Box() {
		fruits = new ArrayList<T>();
	}

	public void addFruit(T fruit) {
		fruits.add(fruit);
	}

	public float getWeight() {

		float weightBox = 0;

		if (fruits.get(0).getClass().getName().equalsIgnoreCase("lesson1.Orange")) {
			weightBox = fruits.size() * Orange.weight;
		}
		if (fruits.get(0).getClass().getName().equalsIgnoreCase("lesson1.Apple")) {
			weightBox = fruits.size() * Apple.weight;
		}

		return weightBox;
	}

	public boolean compare(Box box) {
		return this.getWeight() == box.getWeight();
	}
}
