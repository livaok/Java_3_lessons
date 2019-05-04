package lesson3.client.task;


import lesson3.client.Singleton;

import java.util.concurrent.Callable;

/**
 * @author liva
 */
public class HistoryStoreInitializer implements Callable<Void> {

	@Override
	public Void call() throws Exception {

		Singleton.INSTANCE.getPath().toFile().createNewFile();
		return null;
	}
}
