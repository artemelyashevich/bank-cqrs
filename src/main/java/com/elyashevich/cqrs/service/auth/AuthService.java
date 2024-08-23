package com.elyashevich.cqrs.service.auth;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.web.dto.LoginRequestDto;
import com.elyashevich.cqrs.web.dto.LoginResponseDto;

public interface AuthService {

    LoginResponseDto login(LoginRequestDto dto);

    void register(Client client);
}
