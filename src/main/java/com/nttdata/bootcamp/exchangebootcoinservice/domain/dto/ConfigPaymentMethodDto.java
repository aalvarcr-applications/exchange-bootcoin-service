package com.nttdata.bootcamp.exchangebootcoinservice.domain.dto;

import lombok.Data;
/**
 *
 * @since 2022
 */
@Data
public class ConfigPaymentMethodDto {
    private String id;
    private String methodPaymentId;
    private String numberAccount;
    private String numberCellPhone;
    private String walletId;
}
