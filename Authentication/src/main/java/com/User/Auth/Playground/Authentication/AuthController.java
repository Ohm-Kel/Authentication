package com.User.Auth.Playground.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public String register(@RequestBody UserRegistrationDto dto) {
        userService.registerUser(dto);
        return "Registration successful!";
    }
}
