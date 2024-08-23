package com.elyashevich.cqrs.events;

import com.elyashevich.cqrs.domain.aggregate.Aggregate;
import com.elyashevich.cqrs.domain.model.Account;
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
public class AccountCreateEvent extends AbstractEvent {


    public AccountCreateEvent(Account payload) {
        super(null, EventType.ACCOUNT_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }
}
