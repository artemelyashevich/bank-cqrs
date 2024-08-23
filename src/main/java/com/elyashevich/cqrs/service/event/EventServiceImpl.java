package com.elyashevich.cqrs.service.event;

import com.elyashevich.cqrs.events.AbstractEvent;
import com.elyashevich.cqrs.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    @Override
    public void create(AbstractEvent event) {
        this.repository.save(event);
    }
}
