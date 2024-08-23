package com.elyashevich.cqrs.service.card;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.service.CommandService;
import com.elyashevich.cqrs.service.QueryService;

public interface CardService extends QueryService<Card>, CommandService<Card> {
}
