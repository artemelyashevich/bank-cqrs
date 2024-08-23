package com.elyashevich.cqrs.service.card;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.service.CommandService;

import java.util.UUID;

public interface CardCommandService extends CommandService<Card> {

    void createByClientId(UUID id);
}
