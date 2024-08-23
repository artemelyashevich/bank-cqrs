package com.elyashevich.cqrs.web.dto.mapper;

import com.elyashevich.cqrs.domain.model.Card;
import com.elyashevich.cqrs.web.dto.CardDto;
import org.mapstruct.Mapper;

import java.util.Map;
@Mapper(componentModel = "spring")
public interface CardMapper extends Mappable<Card, CardDto> {
}
