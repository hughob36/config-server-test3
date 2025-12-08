package com.authentication.service.auth_service.service;


import com.authentication.service.auth_service.dto.AuthRequestDTO;
import com.authentication.service.auth_service.dto.AuthResponseDTO;

public interface IAuthenticationService {

    public AuthResponseDTO login(AuthRequestDTO authRequestDTO);
}
