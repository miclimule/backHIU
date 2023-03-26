package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ApiService;

@RestController
@CrossOrigin
@SpringBootApplication
public class BackHiuApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackHiuApplication.class, args);
	}
	
	@GetMapping("/balance")
	public String balance() throws Exception {
		return ApiService.getBalance();
	}
	
	@GetMapping("/payement/{id}/{montant}")
	public String payement(@PathVariable String id, @PathVariable String montant) throws Exception {
		return ApiService.getPayement(id, montant);
	}

	@GetMapping("/transaction/{id}")
	public String transaction(@PathVariable String id) throws Exception {
		return ApiService.getTransaction(id);
	}
	
}
