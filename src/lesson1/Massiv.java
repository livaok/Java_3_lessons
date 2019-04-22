package lesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liva
 */
public class Massiv<T> {

	private T[] array;
	List<T> list = new ArrayList<T>();

	public Massiv(T[] array) {
		this.array = array;
	}

	public void printArray() {
		for (T value : array) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public void printList() {
		for (T value : list) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public void changePlaces(int i, int j) {
		if (i >= array.length || j >= array.length) {
			System.out.println("Index of element >= length of array");
		}
		else {
			T value = array[i];
			array[i] = array[j];
			array[j] = value;
		}
	}

	public void toArraylist() {
		for (T value : array) {
			list.add(value);
		}
	}

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(int i){
		list.remove(i);
	}
}
