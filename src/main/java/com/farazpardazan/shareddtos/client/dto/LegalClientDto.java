package com.farazpardazan.shareddtos.client.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * مشتری حقوقی
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeName(value = "LEGAL_CLIENT")
public class LegalClientDto extends ClientDto{

    private String name;
    private LocalDate registerDate;
    private Set<AuthorizedDto> authorizedSet;
    /* and etc ... */

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public Set<AuthorizedDto> getAuthorizedSet() {
        return authorizedSet;
    }

    public void setAuthorizedSet(Set<AuthorizedDto> authorizedSet) {
        this.authorizedSet = authorizedSet;
    }

    public void addAuthorized (AuthorizedDto authorized){
        if(Objects.isNull(this.authorizedSet))
            this.authorizedSet = new HashSet<>();

        this.authorizedSet.add(authorized);
    }
}
