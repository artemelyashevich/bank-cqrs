package com.elyashevich.cqrs.api.dto.mapper;

import com.elyashevich.cqrs.domain.model.Transaction;
import com.elyashevich.cqrs.api.dto.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper extends Mappable<Transaction, TransactionDto> {
}
