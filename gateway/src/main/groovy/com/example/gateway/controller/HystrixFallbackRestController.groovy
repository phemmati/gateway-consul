package com.example.gateway.controller

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HystrixFallbackRestController {

	@GetMapping("/api/fallback")
	public Mono<String> getS1SvcMsg() {
		return Mono.just("No response fron Service 1 and will be back shortly");
	}

}