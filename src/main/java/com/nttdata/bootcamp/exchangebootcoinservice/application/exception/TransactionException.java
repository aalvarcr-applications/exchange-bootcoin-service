package com.nttdata.bootcamp.exchangebootcoinservice.application.exception;
/**
 *
 * @since 2022
 */
public class TransactionException  extends RuntimeException{
    public TransactionException(String message){
        super(message);
    }
}
