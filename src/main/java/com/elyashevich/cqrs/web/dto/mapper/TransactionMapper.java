package com.elyashevich.cqrs.web.dto.mapper;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.web.dto.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper extends Mappable<Transaction, TransactionDto> {
}
