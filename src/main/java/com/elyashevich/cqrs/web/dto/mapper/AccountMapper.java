package com.elyashevich.cqrs.web.dto.mapper;

import com.elyashevich.cqrs.domain.model.Account;
import com.elyashevich.cqrs.web.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {
}
