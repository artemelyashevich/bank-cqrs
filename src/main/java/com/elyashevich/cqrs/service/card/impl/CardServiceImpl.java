package com.elyashevich.cqrs.service.card.impl;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.service.card.CardCommandService;
import com.elyashevich.cqrs.service.card.CardQueryService;
import com.elyashevich.cqrs.service.card.CardService;
import com.elyashevich.cqrs.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardCommandService commandService;
    private final CardQueryService queryService;
    private final ClientService clientService;

    @Override
    public void create(Card object) {
        this.commandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return this.queryService.getById(id);
    }

    @Override
    public void createByClientId(UUID id) {
        final Client client = this.clientService.getById(id);
        final Card card = new Card(client.getAccount());
        this.commandService.create(card);
    }
}
