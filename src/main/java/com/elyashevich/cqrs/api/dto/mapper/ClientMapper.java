package com.elyashevich.cqrs.api.dto.mapper;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.api.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends Mappable<Client, ClientDto> {
}
