package com.elyashevich.cqrs.service.card;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.service.CommandService;
import com.elyashevich.cqrs.service.QueryService;

import java.util.UUID;

public interface CardService extends QueryService<Card>, CommandService<Card> {

    void createByClientId(UUID id);

    boolean existsByNumberAndDate(String number, String date);
}
