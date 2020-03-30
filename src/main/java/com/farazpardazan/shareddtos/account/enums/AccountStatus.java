package com.farazpardazan.shareddtos.account.enums;

/**
 * وضعیت حساب
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public enum AccountStatus {
    ACTIVE(1), INACTIVE(2);

    private Integer code;

    private AccountStatus(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
