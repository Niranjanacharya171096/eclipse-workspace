package com.socket;

import java.net.*; 
import java.io.*;

public class ClientServer {
	Socket client = null;
	BufferedReader br = null;
	DataInputStream input = null;
	PrintStream output = null;
	
	public ClientServer(String address, int port) {
		
		try {
			client = new Socket(address, port);
			System.out.println("Connected");
			System.out.println(address + " " + port);
		} catch (Exception e){}
		try {
			input = new DataInputStream(client.getInputStream());
			output = new PrintStream(client.getOutputStream());
			br = new BufferedReader(new InputStreamReader(System.in));
			String str = input.readLine(); //get the prompt from the server
			System.out.println(str);
			String filename = br.readLine();
			if (filename!=null){
				output.println(filename);
			}
			String data;
			while ((data=input.readLine())!=null) {
				System.out.println(data);
			}
			output.println("Closing connection");
			client.close();
		} catch (Exception e){
		System.out.println(e);
		}
	}
	public static void main(String args[])
	{
		ClientServer client = new ClientServer("127.0.0.1", 5000);
	}
}