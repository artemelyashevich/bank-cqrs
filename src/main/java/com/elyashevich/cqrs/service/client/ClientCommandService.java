package com.elyashevich.cqrs.service.client;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.service.CommandService;

public interface ClientCommandService extends CommandService<Client> {
}
