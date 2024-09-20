package com.elyashevich.cqrs.service.transaction.impl;

import com.elyashevich.cqrs.exception.ResourceNotFoundException;
import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.repository.TransactionRepository;
import com.elyashevich.cqrs.service.transaction.TransactionQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionQueryServiceImpl implements TransactionQueryService {

    private final TransactionRepository repository;

    @Override
    public Transaction getById(UUID id) {
        return this.repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
