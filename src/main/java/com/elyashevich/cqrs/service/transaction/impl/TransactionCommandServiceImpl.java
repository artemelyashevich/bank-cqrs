package com.elyashevich.cqrs.service.transaction.impl;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.events.TransactionCreateEvent;
import com.elyashevich.cqrs.service.event.EventService;
import com.elyashevich.cqrs.service.transaction.TransactionCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionCommandServiceImpl implements TransactionCommandService {

    private final EventService eventService;

    @Override
    public void create(Transaction object) {
        final TransactionCreateEvent transactionCreateEvent = new TransactionCreateEvent(object);
        this.eventService.create(transactionCreateEvent);
    }
}
