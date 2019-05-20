package lesson7.tests;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Stream;

/**
 * @author liva
 */

public class TestLauncher {

	private static final Logger logger = LogManager.getLogger(TestLauncher.class);

	public static void start(Class clazz) {
		Method[] methods = clazz.getDeclaredMethods();

		Stream.of(methods).filter(method -> {
			if (method.getAnnotation(BeforeSuite.class) != null) {
				return true;
			}
			if (method.getAnnotation(AfterSuite.class) != null) {
				return true;
			}
			return method.getAnnotation(Test.class) != null;
		})
				.sorted(new MethodComparator())
				.forEach(method -> {
					logger.info("Before invoke method {} for class {}", method.getName(), method.getDeclaringClass());
					try {
						//TODO
						method.invoke(clazz.newInstance());
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					finally {
						logger.info("After invoke method {} for class {}", method.getName(), method.getDeclaringClass());
					}
				});
	}

	public static void start(String className) throws Exception {
		start(Class.forName(className));
	}

	private static class MethodComparator implements Comparator<Method> {
		@Override
		public int compare(Method o1, Method o2) {

			if (o1.getAnnotation(BeforeSuite.class) != null) {
				return -1;
			}

			if (o2.getAnnotation(BeforeSuite.class) != null) {
				return 1;
			}

			if (o1.getAnnotation(AfterSuite.class) != null) {
				return 1;
			}

			if (o2.getAnnotation(AfterSuite.class) != null) {
				return -1;
			}

			Test a1 = o1.getAnnotation(Test.class);
			Test a2 = o2.getAnnotation(Test.class);
			return -Integer.compare(a1.priority(), a2.priority());
		}

		@Override
		public boolean equals(Object obj) {
			return Objects.equals(this, obj);
		}
	}
}
