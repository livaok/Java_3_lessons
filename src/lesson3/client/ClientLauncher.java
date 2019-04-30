package lesson3.client;

import lesson3.client.task.HistoryServiceInitializer;
import lesson3.client.task.HistoryStoreInitializer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;



public class ClientLauncher {

	private static List<Callable> initializers = new ArrayList<>();
	static {
		initializers.add(new HistoryStoreInitializer());
		initializers.add(new HistoryServiceInitializer());
	}

		public static void main(String[] args) throws Exception {

			initializers.forEach(callable -> {
				try {
					callable.call();
				}
				catch (Exception e) {
					throw new RuntimeException("Trying write with error", e);
				}
			});

			ClientWindow clientWindow = new ClientWindow();
	}
}
