package com.elyashevich.cqrs.web.controller;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.service.card.CardService;
import com.elyashevich.cqrs.service.transaction.TransactionService;
import com.elyashevich.cqrs.web.dto.TransactionDto;
import com.elyashevich.cqrs.web.dto.mapper.TransactionMapper;
import com.elyashevich.cqrs.web.dto.validation.OnCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;
    private final CardService cardService;

    private final TransactionMapper transactionMapper;

    @GetMapping("/{id}")
    public TransactionDto getById(
            @PathVariable final UUID id
            ) {
        final Transaction transaction = this.transactionService.getById(id);
        return this.transactionMapper.toDto(transaction);
    }

    @PostMapping
    public void create(
            @RequestBody @Validated(OnCreate.class) final TransactionDto dto
            ) {
        if (!this.cardService.existsByNumberAndDate(
                dto.getTo().getNumber(),
                dto.getTo().getDate()
        )){
            throw  new IllegalStateException("Card doesn't exists");
        }
        final Transaction transaction = this.transactionMapper.toEntity(dto);
        this.transactionService.create(transaction);
    }
}
