package com.example.simpleBootWeb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.example.simpleBootWeb.entity.*;

//this class is a controller demonstrating consuming REST services
@RestController
public class ConsumingRest{
	@Autowired
	public RestTemplate restTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(ConsumingRest.class);
	
	@GetMapping("/consume")
	public Quote consume() throws Exception{
		Quote quote = restTemplate.getForObject(
			"https://quoters.apps.pcfone.io/api/random", Quote.class);
		log.info(quote.toString());
		
		return quote;
	}
}
