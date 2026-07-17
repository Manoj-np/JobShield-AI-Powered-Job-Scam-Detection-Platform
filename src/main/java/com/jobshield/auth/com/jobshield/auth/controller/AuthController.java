package com.jobshield.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

import com.jobshield.auth.dto.RegisterRequest;
import com.jobshield.auth.service.UserService;
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private final UserService userService;

	public AuthController(UserService userService) {
	    this.userService = userService;
	}
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(
	        @Valid @RequestBody RegisterRequest request) {

	    userService.registerUser(request);

	    return ResponseEntity.ok("User registered successfully");
	}
}