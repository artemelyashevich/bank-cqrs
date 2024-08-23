package com.elyashevich.cqrs.events;

import com.elyashevich.cqrs.domain.aggregate.Aggregate;
import com.elyashevich.cqrs.domain.model.Transaction;
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
public class TransactionCreateEvent extends AbstractEvent {


    public TransactionCreateEvent(Transaction payload) {
        super(null, EventType.TRANSACTION_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
