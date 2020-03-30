package com.farazpardazan.shareddtos.client.dto;

import com.farazpardazan.shareddtos.client.enums.AuthorizedType;

/**
 * صاحب امضا
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class AuthorizedDto {
    private AuthorizedType type;
    private PersonalClientDto client;
    /* and etc ... */

    public AuthorizedType getType() {
        return type;
    }

    public void setType(AuthorizedType type) {
        this.type = type;
    }

    public PersonalClientDto getClient() {
        return client;
    }

    public void setClient(PersonalClientDto client) {
        this.client = client;
    }
}
