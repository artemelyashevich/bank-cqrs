package com.elyashevich.cqrs.service.card.impl;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.events.CardCreateEvent;
import com.elyashevich.cqrs.service.card.CardCommandService;
import com.elyashevich.cqrs.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardCommandServiceImpl implements CardCommandService {

    private final EventService eventService;

    @Override
    public void create(Card object) {
        final CardCreateEvent cardCreateEvent = new CardCreateEvent(object);
        this.eventService.create(cardCreateEvent);
    }

    @Override
    public void createByClientId(UUID id) {

    }
}
