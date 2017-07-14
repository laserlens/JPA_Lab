package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Address extends BaseBo{
    private int addressid;
    private Integer clientid;
    private Integer personid;
    private int entityTypeid;
    private String addressNumber;
    private String street;
    private String street02;
    private String city;
    private Integer stateid;
    private Integer countryid;
    private Timestamp dateCreate;

    @Id
    @Column(name = "Addressid")
    public int getAddressid() {
        return addressid;
    }

    public void setAddressid(int addressid) {
        this.addressid = addressid;
    }

    @Basic
    @Column(name = "Clientid")
    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    @Basic
    @Column(name = "Personid")
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "EntityTypeid")
    public int getEntityTypeid() {
        return entityTypeid;
    }

    public void setEntityTypeid(int entityTypeid) {
        this.entityTypeid = entityTypeid;
    }

    @Basic
    @Column(name = "AddressNumber")
    public String getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    @Basic
    @Column(name = "Street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "Street02")
    public String getStreet02() {
        return street02;
    }

    public void setStreet02(String street02) {
        this.street02 = street02;
    }

    @Basic
    @Column(name = "City")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "Stateid")
    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    @Basic
    @Column(name = "Countryid")
    public Integer getCountryid() {
        return countryid;
    }

    public void setCountryid(Integer countryid) {
        this.countryid = countryid;
    }

    @Basic
    @Column(name = "DateCreate")
    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (addressid != address.addressid) return false;
        if (entityTypeid != address.entityTypeid) return false;
        if (clientid != null ? !clientid.equals(address.clientid) : address.clientid != null) return false;
        if (personid != null ? !personid.equals(address.personid) : address.personid != null) return false;
        if (addressNumber != null ? !addressNumber.equals(address.addressNumber) : address.addressNumber != null)
            return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (street02 != null ? !street02.equals(address.street02) : address.street02 != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (stateid != null ? !stateid.equals(address.stateid) : address.stateid != null) return false;
        if (countryid != null ? !countryid.equals(address.countryid) : address.countryid != null) return false;
        if (dateCreate != null ? !dateCreate.equals(address.dateCreate) : address.dateCreate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressid;
        result = 31 * result + (clientid != null ? clientid.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + entityTypeid;
        result = 31 * result + (addressNumber != null ? addressNumber.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (street02 != null ? street02.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (stateid != null ? stateid.hashCode() : 0);
        result = 31 * result + (countryid != null ? countryid.hashCode() : 0);
        result = 31 * result + (dateCreate != null ? dateCreate.hashCode() : 0);
        return result;
    }
}
