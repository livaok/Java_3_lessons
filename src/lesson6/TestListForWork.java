package lesson6;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author liva
 */
public class TestListForWork {

	private ListForWork listForWork;

	@Test
	public void test1ReturnArray() {
		listForWork = new ListForWork();

		Assert.assertEquals(new ArrayList<Integer>() {{
			add(2);
			add(5);
			add(1);
		}}, listForWork.returnArray(new ArrayList<Integer>() {{
			add(3);
			add(4);
			add(2);
			add(5);
			add(1);
		}}));
	}

	@Test
	public void test2ReturnArray() {
		listForWork = new ListForWork();

		Assert.assertEquals(new ArrayList<Integer>() {{
			add(3);
			add(4);
			add(1);
		}}, listForWork.returnArray(new ArrayList<Integer>() {{
			add(3);
			add(4);
			add(4);
			add(5);
			add(1);
		}}));
	}

	@Test
	public void test3ReturnArray() {
		listForWork = new ListForWork();

		Assert.assertEquals(new ArrayList<Integer>() {{
			add(0);
			add(1);
		}}, listForWork.returnArray(new ArrayList<Integer>() {{
			add(0);
			add(1);
		}}));
	}
}
