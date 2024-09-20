package com.elyashevich.cqrs.api.controller;

import com.elyashevich.cqrs.service.auth.AuthService;
import com.elyashevich.cqrs.api.dto.ClientDto;
import com.elyashevich.cqrs.api.dto.LoginRequestDto;
import com.elyashevich.cqrs.api.dto.LoginResponseDto;
import com.elyashevich.cqrs.api.dto.mapper.ClientMapper;
import com.elyashevich.cqrs.api.dto.validation.OnCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final ClientMapper clientMapper;

    @PostMapping("/register")
    public void register(
            @RequestBody @Validated(OnCreate.class) final ClientDto dto
            ) {
        var client = this.clientMapper.toEntity(dto);
        this.authService.register(client);
    }

    @PostMapping("/login")
    public LoginResponseDto login(
            @RequestBody @Validated final LoginRequestDto dto
    ) {
        return this.authService.login(dto);
    }
}
