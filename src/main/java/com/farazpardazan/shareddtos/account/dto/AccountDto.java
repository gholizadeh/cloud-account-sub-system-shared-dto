package com.farazpardazan.shareddtos.account.dto;

import com.farazpardazan.shareddtos.account.dto.deposit.DebtDepositAccountDto;
import com.farazpardazan.shareddtos.account.dto.deposit.SavingDepositAccountDto;
import com.farazpardazan.shareddtos.account.dto.investment.LongInvestmentAccountDto;
import com.farazpardazan.shareddtos.account.dto.investment.ShortInvestmentAccountDto;
import com.farazpardazan.shareddtos.account.enums.AccountStatus;
import com.farazpardazan.shareddtos.base.dto.BranchDto;
import com.farazpardazan.shareddtos.base.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * حساب بانکی
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = DebtDepositAccountDto.class),
        @JsonSubTypes.Type(value = SavingDepositAccountDto.class),
        @JsonSubTypes.Type(value = ShortInvestmentAccountDto.class),
        @JsonSubTypes.Type(value = LongInvestmentAccountDto.class)
})
public abstract class AccountDto {
    private Long id;
    private Integer version;
    private Long accountNo;
    private String name;
    private LocalDateTime startDate;
    private BigDecimal currentAmount;
    private CurrencyDto currency;
    private AccountStatus status;
    private BranchDto branch;
    private UserDto openerUser;
    private Set<AccountOwnerDto> accountOwners;
    /** etc **/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public BigDecimal getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(BigDecimal currentAmount) {
        this.currentAmount = currentAmount;
    }

    public CurrencyDto getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyDto currency) {
        this.currency = currency;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public BranchDto getBranch() {
        return branch;
    }

    public void setBranch(BranchDto branch) {
        this.branch = branch;
    }

    public UserDto getOpenerUser() {
        return openerUser;
    }

    public void setOpenerUser(UserDto openerUser) {
        this.openerUser = openerUser;
    }

    public Set<AccountOwnerDto> getAccountOwners() {
        return accountOwners;
    }

    public void setAccountOwners(Set<AccountOwnerDto> accountOwners) {
        this.accountOwners = accountOwners;
    }
}
