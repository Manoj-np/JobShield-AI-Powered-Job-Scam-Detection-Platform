package com.jobshield.auth.service;

import com.jobshield.auth.dto.RegisterRequest;
import com.jobshield.auth.entity.User;

public interface UserService {

    User registerUser(RegisterRequest request);

}