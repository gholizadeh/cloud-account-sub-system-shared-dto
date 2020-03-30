package com.farazpardazan.shareddtos.account.enums;

/**
 * نوع تراکنش واریز / برداشت
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public enum TransactionType {
    DEPOSIT(1), DEBIT(2);

    private Integer code;

    private TransactionType(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
