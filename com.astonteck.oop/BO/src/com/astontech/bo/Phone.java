package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Phone extends BaseBo{
    private int phoneid;
    private int entityid;
    private int clientid;
    private int personid;
    private int areaCode;
    private int phoneNumber;
    private int phoneNumberPost;

    public Phone(){}

//    public Phone(String firstName, String lastName, int areaCode, int phoneNumber, int phoneNumberPost){
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAreaCode(areaCode);
//        this.setPhoneNumber(phoneNumber);
//        this.setPhoneNumberPost(phoneNumberPost);
//    }

    //get to get FullName and Phone

//    public String getNameNumber () {
//        Integer areaString = areaCode;
//        Integer phoneString = phoneNumber;
//        Integer postNumberString = phoneNumberPost;
//        String fullName = this.getFirstName() + " " +  this.getLastName();
//        return  fullName + " #" + "(" + areaString + ")" + phoneString + "-" + postNumberString;
//    }

    @Id
    @Column(name = "Phoneid")
    public int getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(int phoneid) {
        this.phoneid = phoneid;
    }

    @Basic
    @Column(name = "Entityid")
    public int getEntityid() {
        return entityid;
    }

    public void setEntityid(int entityid) {
        this.entityid = entityid;
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
    @Column(name = "AreaCode")
    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    @Basic
    @Column(name = "PhoneNumber")
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "PhoneNumberPost")
    public Integer getPhoneNumberPost() {
        return phoneNumberPost;
    }

    public void setPhoneNumberPost(Integer phoneNumberPost) {
        this.phoneNumberPost = phoneNumberPost;
    }

    @Basic
    @Column(name = "Personid")
    public int getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (phoneid != phone.phoneid) return false;
        if (entityid != phone.entityid) return false;
        if (clientid != phone.clientid) return false;
        if (personid != phone.personid) return false;
        if (areaCode != phone.areaCode) return false;
        if (phoneNumber != phone.phoneNumber) return false;
        if (phoneNumberPost != phone.phoneNumberPost)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = phoneid;
        result = 31 * result + entityid;
        result = 31 * result + clientid ;
        result = 31 * result + personid ;
        result = 31 * result + areaCode ;
        result = 31 * result + phoneNumber ;
        result = 31 * result + phoneNumberPost ;
        return result;
    }
}
