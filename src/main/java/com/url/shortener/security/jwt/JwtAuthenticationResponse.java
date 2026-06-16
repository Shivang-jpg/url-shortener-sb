package com.url.shortener.security.jwt;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String token;
}
