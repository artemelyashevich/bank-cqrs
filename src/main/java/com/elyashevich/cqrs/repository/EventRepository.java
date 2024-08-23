package com.elyashevich.cqrs.repository;

import com.elyashevich.cqrs.events.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
