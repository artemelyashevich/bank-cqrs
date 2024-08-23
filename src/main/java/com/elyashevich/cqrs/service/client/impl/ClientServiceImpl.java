package com.elyashevich.cqrs.service.client.impl;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.service.client.ClientCommandService;
import com.elyashevich.cqrs.service.client.ClientQueryService;
import com.elyashevich.cqrs.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientQueryService queryService;
    private final ClientCommandService commandService;

    @Override
    public void create(Client object) {
        this.commandService.create(object);
    }

    @Override
    public Client getById(UUID id) {
        return this.queryService.getById(id);
    }
}
