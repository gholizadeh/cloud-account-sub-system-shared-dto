package com.farazpardazan.shareddtos.account.dto;

import com.farazpardazan.shareddtos.account.enums.TransactionType;
import com.farazpardazan.shareddtos.base.dto.UserDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * اطلاعات تراکنش همراه عملیات واریز برداشت ارسال می شود
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class TransactionInfoDto {
    private BigDecimal amount;
    private CurrencyDto currency;
    private String description;
    private LocalDateTime date ;
    private Integer referenceNo;
    private Boolean returned;
    private TransactionDto source;
    private UserDto user;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CurrencyDto getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDto currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Integer getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(Integer referenceNo) {
        this.referenceNo = referenceNo;
    }

    public Boolean getReturned() {
        return returned;
    }

    public void setReturned(Boolean returned) {
        this.returned = returned;
    }

    public TransactionDto getSource() {
        return source;
    }

    public void setSource(TransactionDto source) {
        this.source = source;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
