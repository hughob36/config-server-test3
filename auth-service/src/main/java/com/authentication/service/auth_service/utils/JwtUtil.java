package com.authentication.service.auth_service.utils;


import org.springframework.beans.factory.annotation.Value;

public class JwtUtil {

    @Value("{security.jwt.private.key}")
    private String privateKey;

    @Value("{security.jwt.user.generator}")
    private String userGenerator;


}
