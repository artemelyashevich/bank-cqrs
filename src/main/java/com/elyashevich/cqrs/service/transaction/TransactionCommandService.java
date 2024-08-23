package com.elyashevich.cqrs.service.transaction;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.service.CommandService;

public interface TransactionCommandService extends CommandService<Transaction> {
}
