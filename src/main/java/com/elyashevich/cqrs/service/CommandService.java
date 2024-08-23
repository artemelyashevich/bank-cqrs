package com.elyashevich.cqrs.service;

public interface CommandService<T> {

    void create(T object);

}
