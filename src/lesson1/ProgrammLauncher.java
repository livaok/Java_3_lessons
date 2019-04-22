package lesson1;

/**
 * @author liva
 */
public class ProgrammLauncher {

	public static void main(String[] args) {

		Box<Apple> box1 = new Box<Apple>();
		Box<Orange> box2 = new Box<Orange>();

		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		box2.addFruit(new Orange());
		box2.addFruit(new Orange());

		System.out.println(box1.compare(box2));

		Integer[] integers = {1, 2, 3, 4};
		Massiv<Integer> integerMassiv = new Massiv<Integer>(integers);

		String[] strings = {"one", "two", "three", "for"};
		Massiv<String> stringMassiv = new Massiv<String>(strings);

		Apple[] apples = {new Apple(), new Apple(), new Apple()};
		Massiv<Apple> appleMassiv = new Massiv<Apple>(apples);

		stringMassiv.printArray();
		stringMassiv.changePlaces(0, 4);
		stringMassiv.printArray();

		appleMassiv.printArray();
		appleMassiv.changePlaces(1, 2);
		appleMassiv.printArray();

		integerMassiv.toArraylist();
		integerMassiv.addElement(5);
		integerMassiv.removeElement(1);
		integerMassiv.printList();
	}
}
