package com.authentication.service.auth_service.controller;

import com.authentication.service.auth_service.dto.AuthRequestDTO;
import com.authentication.service.auth_service.dto.AuthResponseDTO;
import com.authentication.service.auth_service.service.AuthenticationService;
import com.authentication.service.auth_service.service.IAuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/login")
@RequiredArgsConstructor
public class AuthenticationController {

    private final IAuthenticationService authenticationService;

    @PostMapping
    public ResponseEntity<AuthResponseDTO> login(@RequestBody @Valid AuthRequestDTO authRequestDTO) {
        return ResponseEntity.ok(authenticationService.login(authRequestDTO));
    }
}
