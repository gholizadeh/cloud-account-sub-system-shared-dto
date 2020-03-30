package com.farazpardazan.shareddtos.account.dto;

import com.farazpardazan.shareddtos.account.enums.TransactionType;
import com.farazpardazan.shareddtos.base.dto.UserDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * تراکنش
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class TransactionDto {
    private Long id;
    private BigDecimal amount;
    private TransactionType type;
    private CurrencyDto currency;
    private String description;
    private LocalDateTime date ;
    private LocalDateTime receiveDate;
    private Integer referenceNo;
    private Boolean returned;
    private TransactionDto source;
    private UserDto user;
    private AccountDto account;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
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

    public LocalDateTime getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(LocalDateTime receiveDate) {
        this.receiveDate = receiveDate;
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

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }
}
