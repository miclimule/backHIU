package com.example.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import com.example.demo.util.Utilities;

public class ApiService {

	public static String getBalance() throws Exception {
		URL obj = new URL(Utilities.getBaseUrl() + "/balance");
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(
		    new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
		    response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());
		
		return response.toString();
	}
	
	public static String getPayement(String id, String montant) throws Exception {
		URL obj = new URL(Utilities.getBaseUrl() + "/payment/" + id + "/" + montant);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(
		    new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
		    response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());
		
		return response.toString();
	}
	
	public static String getTransaction(String id) throws Exception {
		URL obj = new URL(Utilities.getBaseUrl() + "/transaction/" + id);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		BufferedReader in = new BufferedReader(
		    new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
		    response.append(inputLine);
		}
		in.close();
		System.out.println(response.toString());
		
		return response.toString();
	}
	
}