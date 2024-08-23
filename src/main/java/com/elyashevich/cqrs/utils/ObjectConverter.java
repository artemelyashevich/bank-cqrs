package com.elyashevich.cqrs.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import lombok.SneakyThrows;

@Converter
public class ObjectConverter  implements AttributeConverter<Object, String> {

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object o) {
        var objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(o);
    }

    @Override
    public Object convertToEntityAttribute(String s) {
        var objectMapper = new ObjectMapper();
        return objectMapper.convertValue(s, Object.class);
    }
}
