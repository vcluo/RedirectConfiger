package com.example.demo.proxy.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.example.demo.util.PropertiesUtil;


/**
 * 
 * @author cpplc
 * @see interface for Peerconnection Service is connection 
 * @since 2021/02/01
 */
@Component
public class TcpServerProxyImpl extends Thread {


	Logger logger = LoggerFactory.getLogger(TcpServerProxyImpl.class);
	public volatile static HashMap<String, ArrayList<String>> hashMap;
	public static String byteToHex(byte b){ 
		String hex = Integer.toHexString(b & 0xFF); 
		if(hex.length() < 2){ 
			hex = "0" + hex; 
		} 
		return hex; 
	}

	@Override
	public void run() {
		hashMap = new HashMap<String, ArrayList<String>>();
		ServerSocket listenSocket;
		Socket socket = null;
		try {
			listenSocket = new ServerSocket(new PropertiesUtil().getPropertie("port"));
			while (true) {
				socket = listenSocket.accept();
				new ServerThread(socket);
			}
			
		} catch (IOException e) {                                             
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			    		
	}
		
	class ServerThread extends Thread{
		private Socket client;
		private InputStream inputStream;
		byte[] bytes = new byte[1000];
		String temp = "";
		public ServerThread(Socket socket) throws IOException {
			client = socket;
			inputStream = client.getInputStream();
			start();
		}
		@Override
		public void run() {
			try {
				while(inputStream.read(bytes) != -1) {
				for (int i = 0; i < bytes.length; i++) {
					temp += byteToHex(bytes[i]);
				}

				}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


	
	



	
