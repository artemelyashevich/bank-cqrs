package com.elyashevich.cqrs.service.account.impl;

import com.elyashevich.cqrs.domain.exception.ResourceNotFoundException;
import com.elyashevich.cqrs.domain.model.Account;
import com.elyashevich.cqrs.repository.AccountRepository;
import com.elyashevich.cqrs.service.account.AccountQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountQueryServiceImpl implements AccountQueryService {

    private final AccountRepository repository;

    @Override
    public Account getById(UUID id) {
        return this.repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
