package com.elyashevich.cqrs.service.account.impl;

import com.elyashevich.cqrs.domain.model.Account;
import com.elyashevich.cqrs.events.AccountCreateEvent;
import com.elyashevich.cqrs.service.account.AccountCommandService;
import com.elyashevich.cqrs.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountCommandServiceImpl implements AccountCommandService {

    private final EventService eventService;

    @Override
    public void create(final Account object) {
        var event = new AccountCreateEvent(object);
        this.eventService.create(event);
    }
}
