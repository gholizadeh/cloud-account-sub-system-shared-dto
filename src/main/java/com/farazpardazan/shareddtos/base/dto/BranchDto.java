package com.farazpardazan.shareddtos.base.dto;

/**
 * شعب بانک
 * @author Saeed Gholizadeh gholizade.saeed@yahoo.com
 */
public class BranchDto {
    private Long id;
    private String name;
    private String code;
    private BranchDto parent;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BranchDto getParent() {
        return parent;
    }

    public void setParent(BranchDto parent) {
        this.parent = parent;
    }
}
