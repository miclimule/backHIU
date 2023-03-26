package com.example.demo.testApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.example.demo.service.ApiService;

public class Main {

	public static void main(String[] args) throws Exception {
		ApiService.getPayement("KFPweg1", "1000");
		    
		    
	}
	
}
