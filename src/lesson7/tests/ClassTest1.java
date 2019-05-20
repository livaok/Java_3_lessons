package lesson7.tests;

/**
 * @author liva
 */

public class ClassTest1 {

	@Test(priority = 2)
	public void test1() {
	}

	@Test(priority = 10)
	public void test2() {
	}

	@Test(priority = 5)
	public void test3() {
	}

	@AfterSuite
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeTest() {
	}
}
