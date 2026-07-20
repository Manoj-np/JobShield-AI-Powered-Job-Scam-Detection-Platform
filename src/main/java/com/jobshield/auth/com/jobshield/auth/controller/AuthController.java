package com.jobshield.auth.controller;
import com.jobshield.auth.dto.LoginResponse;
import com.jobshield.security.jwt.JwtService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.validation.Valid;

import com.jobshield.auth.dto.LoginRequest;
import com.jobshield.auth.dto.RegisterRequest;
import com.jobshield.auth.entity.User;
import com.jobshield.auth.service.UserService;
@RestController
@RequestMapping("/api/auth")
public class AuthController {
	private final UserService userService;

	 private final JwtService jwtService;

	    public AuthController(UserService userService,
	                          JwtService jwtService) {
	        this.userService = userService;
	        this.jwtService = jwtService;
	    }

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(
	        @Valid @RequestBody RegisterRequest request) {

	    userService.registerUser(request);

	    return ResponseEntity.ok("User registered successfully");
	}
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> loginUser(
	        @Valid @RequestBody LoginRequest request) {

	    User user = userService.loginUser(request);

	    String token = jwtService.generateToken(user);

	    LoginResponse response = new LoginResponse(token);

	    return ResponseEntity.ok(response);
	}@RestController
	@RequestMapping("/api/test")
	public class TestController {

	    @GetMapping
	    public String test() {
	        return "JWT Authentication Successful";
	    }
	}
}