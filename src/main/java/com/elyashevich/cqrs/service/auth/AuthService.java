package com.elyashevich.cqrs.service.auth;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.api.dto.LoginRequestDto;
import com.elyashevich.cqrs.api.dto.LoginResponseDto;

public interface AuthService {

    LoginResponseDto login(LoginRequestDto dto);

    void register(Client client);
}
