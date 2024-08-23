package com.elyashevich.cqrs.events;

import com.elyashevich.cqrs.domain.aggregate.Aggregate;
import com.elyashevich.cqrs.domain.model.Client;
import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
public class ClientCreateEvent extends AbstractEvent {


    public ClientCreateEvent(Client payload) {
        super(null, EventType.CLIENT_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
