package com.nttdata.bootcamp.exchangebootcoinservice.domain.dto;

import lombok.*;

import java.math.BigDecimal;
/**
 *
 * @since 2022
 */
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RequestBootcoin {
    private String sourceWalletId;
    private String targetWalletId;
    private BigDecimal amount;
}
