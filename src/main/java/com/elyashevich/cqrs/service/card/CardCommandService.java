package com.elyashevich.cqrs.service.card;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.service.CommandService;

public interface CardCommandService extends CommandService<Card> {
}
