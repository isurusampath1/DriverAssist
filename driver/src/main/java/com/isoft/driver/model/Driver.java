package com.isoft.driver.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Driver {

    @Id
    private int nic;
    private String firstName;
    private String lastName;
    private String organization;
    private String roleType;

    public Driver() {
    }

    public Driver(int nic, String firstName, String lastName, String organization, String roleType) {
        this.nic = nic;
        this.firstName = firstName;
        this.lastName = lastName;
        this.organization = organization;
        this.roleType = roleType;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
}
