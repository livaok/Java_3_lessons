package lesson7.tests;

/**
 * @author liva
 */
public class ProgramLauncher {

	public static void main(String[] args) throws Exception {
		TestLauncher.start(ClassTest1.class);
		TestLauncher.start(ClassTest2.class.getName());
	}
}
