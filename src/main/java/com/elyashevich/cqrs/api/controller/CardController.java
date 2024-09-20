package com.elyashevich.cqrs.api.controller;

import com.elyashevich.cqrs.service.card.CardService;
import com.elyashevich.cqrs.api.dto.CardDto;
import com.elyashevich.cqrs.api.dto.TransactionDto;
import com.elyashevich.cqrs.api.dto.mapper.CardMapper;
import com.elyashevich.cqrs.api.dto.mapper.TransactionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/cards")
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    private final CardMapper cardMapper;
    private final TransactionMapper transactionMapper;

    @GetMapping("/{id}")
    public CardDto getById(
            @PathVariable final UUID id
    ) {
        var card = this.cardService.getById(id);
        return cardMapper.toDto(card);
    }

    @GetMapping("/{id}/transactions")
    public List<TransactionDto> getTransactionsById(
            @PathVariable final UUID id
    ) {
        var card = this.cardService.getById(id);
        return this.transactionMapper.toDto(card.getTransactions());
    }

    @PostMapping
    public void create() {
        var uuid = UUID.randomUUID();
        this.cardService.createByClientId(uuid);
    }
}
