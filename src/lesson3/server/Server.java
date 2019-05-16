package lesson3.server;

import lesson3.client.ClientHandler;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Server {

	static final int PORT = 8880;
	List<ClientHandler> clients = new ArrayList<ClientHandler>();
	Logger LOGGER = LogManager.getLogger(Server.class);


	//число чловек в чате ограничено числом 100
	ExecutorService executorService = Executors.newScheduledThreadPool(100, r -> {
		Thread thread = new Thread(r);
		return thread;
	});

	public Server() {
		ServerSocket serverSocket = null;
		Socket clientSocket = null;

		try {
			serverSocket = new ServerSocket(PORT);
			System.out.println("Server is launched");
			LOGGER.info("Server is launched");

			while (true) {
				clientSocket = serverSocket.accept();
				ClientHandler client = new ClientHandler(clientSocket, this);
				LOGGER.info("New client");
				clients.add(client);
				executorService.submit(client);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				clientSocket.close();
				System.out.println("Server finished his work");
				LOGGER.info("Server finished his work");
				serverSocket.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void sendMsgToAllClients(String msg) {
		for (ClientHandler client : clients) {
			client.sendMsg(msg);
		}
	}

	public void removeClientFromServer(ClientHandler client) {
		clients.remove(client);
	}
}
