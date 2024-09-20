package com.elyashevich.cqrs.api.dto.mapper;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.api.dto.CardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper extends Mappable<Card, CardDto> {
}
