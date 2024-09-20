package com.elyashevich.cqrs.service.client.impl;

import com.elyashevich.cqrs.exception.ResourceNotFoundException;
import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.repository.ClientRepository;
import com.elyashevich.cqrs.service.client.ClientQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientQueryServiceImpl implements ClientQueryService {

    private final ClientRepository repository;

    @Override
    public Client getById(UUID id) {
        return this.repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByUsername(String username) {
        return this.repository.existsByUsername(username);
    }
}
