package com.elyashevich.cqrs.service.transaction.impl;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.service.transaction.TransactionCommandService;
import com.elyashevich.cqrs.service.transaction.TransactionQueryService;
import com.elyashevich.cqrs.service.transaction.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionQueryService queryService;
    private final TransactionCommandService commandService;

    @Override
    public void create(Transaction object) {
        this.commandService.create(object);
    }

    @Override
    public Transaction getById(UUID id) {
        return this.queryService.getById(id);
    }
}
