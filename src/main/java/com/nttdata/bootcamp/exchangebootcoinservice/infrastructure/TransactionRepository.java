package com.nttdata.bootcamp.exchangebootcoinservice.infrastructure;

import com.nttdata.bootcamp.exchangebootcoinservice.domain.model.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
/**
 *
 * @since 2022
 */
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
}
