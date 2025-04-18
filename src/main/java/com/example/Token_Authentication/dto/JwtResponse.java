package com.example.Token_Authentication.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtResponse {

    private final String accessToken;
    private final String refreshToken;
    private final String email;
}