package com.User.Auth.Playground.Authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @DeleteMapping("/users/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, String> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return Map.of("message", "User deleted successfully");
    }

    @GetMapping("/dashboard")
    @PreAuthorize("hasRole('ADMIN')")
    public Map<String, Object> adminDashboard() {
        long userCount = userRepository.count();
        return Map.of(
                "message", "Welcome to admin dashboard!",
                "totalUsers", userCount
        );
    }
}
