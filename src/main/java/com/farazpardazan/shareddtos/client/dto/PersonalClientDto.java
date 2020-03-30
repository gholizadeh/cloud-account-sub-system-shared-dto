package com.farazpardazan.shareddtos.client.dto;

import com.farazpardazan.shareddtos.client.enums.PersonalType;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDate;

/**
 * مشتری حقیقی
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
@JsonTypeName(value = "PERSONAL_CLIENT")
public class PersonalClientDto extends ClientDto{
    private String firstName;
    private String LastName;
    private String fatherName;
    private PersonalType personalType;
    private LocalDate birthDate;
    private String mobileNumber;
    private byte[] signature;
    /* and etc ... */

    @Override
    public String getName() {
        return this.fatherName.concat(" ").concat(this.LastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public PersonalType getPersonalType() {
        return personalType;
    }

    public void setPersonalType(PersonalType personalType) {
        this.personalType = personalType;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }
}
