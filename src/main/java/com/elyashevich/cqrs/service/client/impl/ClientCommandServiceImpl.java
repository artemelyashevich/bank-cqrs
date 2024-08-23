package com.elyashevich.cqrs.service.client.impl;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.events.ClientCreateEvent;
import com.elyashevich.cqrs.service.client.ClientCommandService;
import com.elyashevich.cqrs.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientCommandServiceImpl implements ClientCommandService {

    private final EventService eventService;

    @Override
    public void create(Client object) {
        final ClientCreateEvent clientCreateEvent = new ClientCreateEvent(object);
        this.eventService.create(clientCreateEvent);
    }
}
