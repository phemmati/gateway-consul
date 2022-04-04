package com.example.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rx.Single;

@RestController
class ErrorFallbackController extends Throwable {
    @GetMapping("/api/fallback") Single<String> index(){
        return Single.just("No response from Service 1. Please try again.");
    }
}