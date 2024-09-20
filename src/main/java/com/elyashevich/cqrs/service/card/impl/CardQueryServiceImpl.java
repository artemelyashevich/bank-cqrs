package com.elyashevich.cqrs.service.card.impl;

import com.elyashevich.cqrs.exception.ResourceNotFoundException;
import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.repository.CardRepository;
import com.elyashevich.cqrs.service.card.CardQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardQueryServiceImpl implements CardQueryService {

    private final CardRepository repository;

    @Override
    public Card getById(UUID id) {
        return this.repository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByNumberAndDate(String number, String date) {
        return this.repository.existsByNumberAndDate(number, date);
    }
}
