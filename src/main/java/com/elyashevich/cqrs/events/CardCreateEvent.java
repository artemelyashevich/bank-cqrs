package com.elyashevich.cqrs.events;

import com.elyashevich.cqrs.domain.aggregate.Aggregate;
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
public class CardCreateEvent extends AbstractEvent {


    public CardCreateEvent(Object payload) {
        super(null, EventType.CARD_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
