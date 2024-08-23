package com.elyashevich.cqrs.service.card.impl;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.service.card.CardCommandService;
import com.elyashevich.cqrs.service.card.CardQueryService;
import com.elyashevich.cqrs.service.card.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardCommandService commandService;
    private final CardQueryService queryService;

    @Override
    public void create(Card object) {
        this.commandService.create(object);
    }

    @Override
    public Card getById(UUID id) {
        return this.queryService.getById(id);
    }
}
