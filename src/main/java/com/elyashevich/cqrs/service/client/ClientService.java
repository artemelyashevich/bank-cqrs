package com.elyashevich.cqrs.service.client;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.service.CommandService;
import com.elyashevich.cqrs.service.QueryService;

public interface ClientService extends CommandService<Client>, QueryService<Client> {
}
