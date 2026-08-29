package com.example.resourcebookingsystem.Controller;
 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.resourcebookingsystem.Service.AuthService;
import com.example.resourcebookingsystem.dto.auth.LoginRequest;
import com.example.resourcebookingsystem.dto.auth.LoginResponse;

 

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(
            @RequestBody LoginRequest request) {

        return ResponseEntity.ok(
                authService.login(request)
        );
    }
}