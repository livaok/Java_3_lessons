package lesson6;

/**
 * @author liva
 */
public class ArrayForCheck {

	int a = 1;
	int b = 4;

	boolean checkArray(int[] array){

		for (int i = 0; i < array.length; i++) {
			if (array[i] == a || array[i] == b){
				return true;
			}
		}
		return false;
	}
}
