package com.elyashevich.cqrs.events;

import com.elyashevich.cqrs.domain.aggregate.Aggregate;

public interface Event {

    void apply(Aggregate aggregate);
}
