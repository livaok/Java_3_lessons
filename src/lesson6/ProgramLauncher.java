package lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liva
 */
public class ProgramLauncher {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<>();

		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(2);
		array.add(1);

		System.out.println(new ListForWork().returnArray(array));
	}
}
