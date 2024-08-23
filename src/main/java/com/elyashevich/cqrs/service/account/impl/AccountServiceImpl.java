package com.elyashevich.cqrs.service.account.impl;

import com.elyashevich.cqrs.domain.model.Account;
import com.elyashevich.cqrs.service.account.AccountCommandService;
import com.elyashevich.cqrs.service.account.AccountQueryService;
import com.elyashevich.cqrs.service.account.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountQueryService queryService;
    private final AccountCommandService commandService;

    @Override
    public void create(Account object) {
        this.commandService.create(object);
    }

    @Override
    public Account getById(UUID id) {
        return this.queryService.getById(id);
    }
}
