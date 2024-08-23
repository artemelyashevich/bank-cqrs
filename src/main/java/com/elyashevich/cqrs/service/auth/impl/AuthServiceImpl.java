package com.elyashevich.cqrs.service.auth.impl;

import com.elyashevich.cqrs.domain.exception.ResourceAlreadyExistsException;
import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.service.auth.AuthService;
import com.elyashevich.cqrs.service.client.ClientService;
import com.elyashevich.cqrs.web.dto.LoginRequestDto;
import com.elyashevich.cqrs.web.dto.LoginResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ClientService clientService;

    @Override
    public LoginResponseDto login(LoginRequestDto dto) {
        return null;
    }

    @Override
    public void register(Client client) {
        if (this.clientService.existsByUsername(client.getUsername())) {
            throw new ResourceAlreadyExistsException();
        }
        client.setPassword(client.getPassword());
        this.clientService.create(client);
    }
}
