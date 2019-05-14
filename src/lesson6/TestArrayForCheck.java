package lesson6;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author liva
 */
public class TestArrayForCheck {

	private ArrayForCheck array;

	@Test
	public void test1checkArray() {
		array = new ArrayForCheck();
		Assert.assertEquals(true, array.checkArray(new int[]{1, 5, 6}));
	}

	@Test
	public void test2checkArray() {
		array = new ArrayForCheck();
		Assert.assertEquals(false, array.checkArray(new int[]{2, 3, 5}));
	}

	@Test
	public void test3checkArray() {
		array = new ArrayForCheck();
		Assert.assertEquals(false, array.checkArray(new int[]{2, 1, 1}));
	}
}
