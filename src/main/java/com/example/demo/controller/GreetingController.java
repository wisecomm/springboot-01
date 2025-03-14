package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.exception.GError;
import com.example.demo.common.exception.GException;
import com.example.demo.common.model.GResponse;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public ResponseEntity<GResponse> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		log.info("greeting 메소드 콜");
		if(name.equals("World")) {
			throw new GException(GError.INVALID_PARAM, String.format("로그인 정보가 올바르지 않습니다."));
		}

        return ResponseEntity.ok().body(new GResponse("0000", "0000 리턴 메시지", name));
	}
        
}
