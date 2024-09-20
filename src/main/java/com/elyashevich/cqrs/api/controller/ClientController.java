package com.elyashevich.cqrs.api.controller;

import com.elyashevich.cqrs.service.client.ClientService;
import com.elyashevich.cqrs.api.dto.AccountDto;
import com.elyashevich.cqrs.api.dto.CardDto;
import com.elyashevich.cqrs.api.dto.ClientDto;
import com.elyashevich.cqrs.api.dto.mapper.AccountMapper;
import com.elyashevich.cqrs.api.dto.mapper.CardMapper;
import com.elyashevich.cqrs.api.dto.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    private final ClientMapper clientMapper;
    private final CardMapper cardMapper;
    private final AccountMapper accountMapper;

    @GetMapping("/{id}")
    public ClientDto getById(
            @PathVariable final UUID id
            ) {
        var client = this.clientService.getById(id);
        return this.clientMapper.toDto(client);
    }

    @GetMapping("/{id}/cards")
    public List<CardDto> getCardsById(
            @PathVariable final UUID id
    ) {
        var client = this.clientService.getById(id);
        return this.cardMapper.toDto(client.getCards());
    }

    @GetMapping("/{id}/account")
    public AccountDto getAccountById(
            @PathVariable final UUID id
    ) {
        var client = this.clientService.getById(id);
        return this.accountMapper.toDto(client.getAccount());
    }
}
