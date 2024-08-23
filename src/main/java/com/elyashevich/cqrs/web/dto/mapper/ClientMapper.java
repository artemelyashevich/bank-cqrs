package com.elyashevich.cqrs.web.dto.mapper;

import com.elyashevich.cqrs.domain.model.Client;
import com.elyashevich.cqrs.web.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends Mappable<Client, ClientDto> {
}
