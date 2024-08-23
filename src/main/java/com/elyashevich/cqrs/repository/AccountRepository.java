package com.elyashevich.cqrs.repository;

import com.elyashevich.cqrs.domain.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
}
