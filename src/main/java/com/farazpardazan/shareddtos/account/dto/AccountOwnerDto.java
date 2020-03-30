package com.farazpardazan.shareddtos.account.dto;

import com.farazpardazan.shareddtos.client.dto.ClientDto;

/**
 * صاحبان حساب
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class AccountOwnerDto {
    private Long id;
    private AccountDto account;
    private ClientDto client;
    private Short subscriptionRate;
    /** etc **/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountDto getAccount() {
        return account;
    }

    public void setAccount(AccountDto account) {
        this.account = account;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public Short getSubscriptionRate() {
        return subscriptionRate;
    }

    public void setSubscriptionRate(Short subscriptionRate) {
        this.subscriptionRate = subscriptionRate;
    }
}
