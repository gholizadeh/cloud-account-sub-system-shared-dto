package com.farazpardazan.shareddtos.account.dto;

import java.math.BigDecimal;

/**
 * ارز
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class CurrencyDto {
    private Long id;
    private String name;
    private BigDecimal rateAgainstGold;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRateAgainstGold() {
        return rateAgainstGold;
    }

    public void setRateAgainstGold(BigDecimal rateAgainstGold) {
        this.rateAgainstGold = rateAgainstGold;
    }
}
