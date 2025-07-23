package com.socket;

import java.net.*;
import java.io.*;

public class ServerClient {
	private ServerSocket server = null;
	private Socket client = null;
	private PrintStream output = null;
	private DataInputStream input = null;
	
	public ServerClient(int port)
	{
		try {
			server = new ServerSocket(port);
			System.out.println("Server started");

			System.out.println("Waiting for a client ...");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		while (true) {
			
			try {
				client = server.accept();
				System.out.println("Client accepted");
			} catch (Exception e) {
				System.out.println(e);
			}
			
			try {
				output = new PrintStream(client.getOutputStream());
				input = new DataInputStream(client.getInputStream());
			} catch (Exception e) {
				System.out.println(e);
			}
			//Send the command prompt to client
			output.println("Enter the filename :>");
			try {
				//get the filename from client
				String filename = input.readLine();
				System.out.println("Client requested file :" + filename);
				try {
					File f = new File(filename);
					BufferedReader br = new BufferedReader(new FileReader(f));
					String data;
					while ((data = br.readLine()) != null) {
					output.println(data);
				}
				} catch (FileNotFoundException e) {
					output.println("File not found");
				}
				output.println("Closing connection");
				client.close();
			} catch (Exception e) {
			System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		ServerClient server = new ServerClient(5000);
	}
}