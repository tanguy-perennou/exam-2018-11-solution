package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Serves multiple requests for a single client
 * Please debug me
 * 
 * @author t.perennou
 */
public class ServerForSingleClient {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(6789); // use same port as in Client.java
		Socket clientSocket = serverSocket.accept();
		PrintWriter socketWriter = new PrintWriter(clientSocket.getOutputStream());
		BufferedReader socketReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		String request = ""; // init request with a non-null value so that we can enter the service loop
		while(request != null && !request.equals("exit")) {
			// 1. read request; null means that client has gone
			request = socketReader.readLine();

			// 2. computer reply; unchanged
			String reply = request.toUpperCase() + " " + request.toUpperCase();

			// 3. send reply; remember that you have to flush it somehow
			socketWriter.println(reply);
			socketWriter.flush(); // mandatory, otherwise message is remains stuck in the client process
		}
		clientSocket.close();
		serverSocket.close();
	}
}
