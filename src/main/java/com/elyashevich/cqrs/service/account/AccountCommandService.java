package com.elyashevich.cqrs.service.account;

import com.elyashevich.cqrs.domain.model.Account;
import com.elyashevich.cqrs.service.CommandService;

public interface AccountCommandService extends CommandService<Account> {
}
