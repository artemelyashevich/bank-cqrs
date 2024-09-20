package com.elyashevich.cqrs.api.dto.mapper;

import com.elyashevich.cqrs.domain.model.Account;
import com.elyashevich.cqrs.api.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {
}
