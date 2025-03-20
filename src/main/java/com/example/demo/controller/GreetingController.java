package com.example.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.common.exception.GError;
import com.example.demo.common.exception.GException;
import com.example.demo.common.model.GResponse;
import com.example.demo.common.utils.TokenUtils;
import com.example.demo.common.utils.TokenUtils2;
import com.example.demo.model.dto.UserDetailsDto;
import com.example.demo.model.dto.UserDto;
import com.example.demo.model.dto.UserDto2;
import com.example.demo.service.UserService;
import com.example.demo.service.UserService2;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

//    private final UserService userService;
	@Autowired
	private UserDetailsService userDetailsService;
    @Autowired
    private UserService2 userService;


	@GetMapping("/greeting")
	public ResponseEntity<GResponse> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		log.info("greeting 메소드 콜");
		if(name.equals("World")) {
			throw new GException(GError.INVALID_PARAM, String.format("로그인 정보가 올바르지 않습니다."));
		}

        return ResponseEntity.ok().body(new GResponse("0000", "0000 리턴 메시지", name));
	}

    @Operation(summary = "관리자 로그인")
    @PostMapping("/adminlogin")
	public ResponseEntity<GResponse> adminlogin(@RequestParam String userId, @RequestParam String userPw) {
		log.info("adminlogin 메소드 콜");

		/*
		UserDetailsDto userDetailsDto = (UserDetailsDto) userDetailsService.loadUserByUsername(userId);
		if (!(userDetailsDto.getUserPw().equalsIgnoreCase(userPw))) {
			throw new BadCredentialsException(userDetailsDto.getUserNm() + "Invalid password");
		}

//		userService.selectUserList(null);


        return ResponseEntity.ok().body(new GResponse("0000", "0000 리턴 메시지", userDetailsDto));
		*/

        UserDto2 user = userService.getUserById(userId);

		String token = TokenUtils2.generateJwt(user);

        return ResponseEntity.ok().body(new GResponse("0000", "0000 리턴 메시지", token));
	}
        
}
