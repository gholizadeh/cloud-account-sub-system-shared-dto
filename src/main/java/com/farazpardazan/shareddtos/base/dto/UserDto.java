package com.farazpardazan.shareddtos.base.dto;

/**
 *کاربر بانکا
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class UserDto {
    private Long id;
    private String name;
    private String personalCode;
    private BranchDto branch;
    /** etc **/

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

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public BranchDto getBranch() {
        return branch;
    }

    public void setBranch(BranchDto branch) {
        this.branch = branch;
    }
}
