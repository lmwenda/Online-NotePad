package com.company;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    static final int PORT = 8080;

    public static void main(String[] args) throws IOException {
	// write your code here
        ServerSocket listener = new ServerSocket(PORT);
        System.out.println("[SERVER] Checking for the Client...");
        Socket client = listener.accept();

        // Debugging
        System.out.println("[SERVER] Connected to the Client");

        // new thread for a client
        //thread = new EchoThread(socket).start();

        // Closed Servers
        client.close();
        listener.close();
    }
}
