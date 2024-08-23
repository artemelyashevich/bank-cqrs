package com.elyashevich.cqrs.service.transaction;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.service.CommandService;
import com.elyashevich.cqrs.service.QueryService;

public interface TransactionService extends QueryService<Transaction>, CommandService<Transaction> {
}
