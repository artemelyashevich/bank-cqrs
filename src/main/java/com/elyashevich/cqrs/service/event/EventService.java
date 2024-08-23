package com.elyashevich.cqrs.service.event;

import com.elyashevich.cqrs.events.AbstractEvent;

public interface EventService {

    void create(AbstractEvent event);
}
