package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Loyaltycompany extends BaseBo {
    private int loyaltyCompanyid;
    private String loyaltyCompanyName;
    private Integer loyaltyCompanyMemberNumber;
    private Integer entityid;
    private Integer employeeid;
    private Integer personid;

    @Basic
    @Column(name = "LoyaltyCompanyid")
    public int getLoyaltyCompanyid() {
        return loyaltyCompanyid;
    }

    public void setLoyaltyCompanyid(int loyaltyCompanyid) {
        this.loyaltyCompanyid = loyaltyCompanyid;
    }

    @Basic
    @Column(name = "LoyaltyCompanyName")
    public String getLoyaltyCompanyName() {
        return loyaltyCompanyName;
    }

    public void setLoyaltyCompanyName(String loyaltyCompanyName) {
        this.loyaltyCompanyName = loyaltyCompanyName;
    }

    @Basic
    @Column(name = "LoyaltyCompanyMemberNumber")
    public Integer getLoyaltyCompanyMemberNumber() {
        return loyaltyCompanyMemberNumber;
    }

    public void setLoyaltyCompanyMemberNumber(Integer loyaltyCompanyMemberNumber) {
        this.loyaltyCompanyMemberNumber = loyaltyCompanyMemberNumber;
    }

    @Basic
    @Column(name = "Entityid")
    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
    }

    @Basic
    @Column(name = "Employeeid")
    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    @Basic
    @Column(name = "Personid")
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Loyaltycompany that = (Loyaltycompany) o;

        if (loyaltyCompanyid != that.loyaltyCompanyid) return false;
        if (loyaltyCompanyName != null ? !loyaltyCompanyName.equals(that.loyaltyCompanyName) : that.loyaltyCompanyName != null)
            return false;
        if (loyaltyCompanyMemberNumber != null ? !loyaltyCompanyMemberNumber.equals(that.loyaltyCompanyMemberNumber) : that.loyaltyCompanyMemberNumber != null)
            return false;
        if (entityid != null ? !entityid.equals(that.entityid) : that.entityid != null) return false;
        if (employeeid != null ? !employeeid.equals(that.employeeid) : that.employeeid != null) return false;
        if (personid != null ? !personid.equals(that.personid) : that.personid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = loyaltyCompanyid;
        result = 31 * result + (loyaltyCompanyName != null ? loyaltyCompanyName.hashCode() : 0);
        result = 31 * result + (loyaltyCompanyMemberNumber != null ? loyaltyCompanyMemberNumber.hashCode() : 0);
        result = 31 * result + (entityid != null ? entityid.hashCode() : 0);
        result = 31 * result + (employeeid != null ? employeeid.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        return result;
    }
}
