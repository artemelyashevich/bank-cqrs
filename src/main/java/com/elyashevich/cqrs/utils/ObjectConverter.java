package com.elyashevich.cqrs.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter implements AttributeConverter<Object, String> {

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object o) {
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(o);
    }

    @Override
    public Object convertToEntityAttribute(String s) {
        final ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(s, Object.class);
    }
}
