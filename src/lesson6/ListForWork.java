package lesson6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liva
 */
class ListForWork {

	List<Integer> returnArray(List<Integer> array) {

		Integer point = null;
		int number = 4;

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == number && i <= array.size() - 1) {
				point = i;
			}
		}

		if (point == null) {
			throw new RuntimeException("Not found " + number);
		}

		else {
			for (int i = point + 1; i < array.size(); i++) {
				list.add(array.get(i));
			}
		}

		return list;
	}
}
