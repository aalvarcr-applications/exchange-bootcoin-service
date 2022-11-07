package com.nttdata.bootcamp.exchangebootcoinservice.infrastructure;

import com.nttdata.bootcamp.exchangebootcoinservice.domain.model.PayOrder;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
/**
 *
 * @since 2022
 */
public interface PayOrderRepository extends ReactiveMongoRepository<PayOrder, String> {
}
