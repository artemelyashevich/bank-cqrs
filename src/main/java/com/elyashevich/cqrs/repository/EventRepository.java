package com.elyashevich.cqrs.repository;

import com.elyashevich.cqrs.events.AbstractEvent;
import com.elyashevich.cqrs.events.Event;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
