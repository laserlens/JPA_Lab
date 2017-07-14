package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Email extends BaseBo{

    //region Properties
    private int emailid;
    private String emailAddress;
    private Entitytype emailType;
    private Integer entityid;
    private Integer personid;
    private Integer employeeid;
    private Integer clientid;
    //endregion

    //region getters and setter
    @Basic
    @Column(name = "Emailid")
    public int getEmailid() {
        return emailid;
    }

    public void setEmailid(int emailid) {
        this.emailid = emailid;
    }

    @Basic
    @Column(name = "EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
    @Column(name = "Personid")
    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
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
    @Column(name = "Clientid")
    public Integer getClientid() {
        return clientid;
    }

    public void setClientid(Integer clientid) {
        this.clientid = clientid;
    }

    public void setEmailType(Entitytype emailType){this.emailType = emailType; }

    public Entitytype getEmailType() {return emailType;}

    public String getEmailTypeAndEmail(){return emailType.getEntityTypeName() + ": " + emailAddress;}
    //endregion

    //region constructors
    public Email(){
        this.setEmailType(new Entitytype());
    }



    public Email(String emailAddress){
        this.setEmailType(new Entitytype());
        this.setEmailAddress(emailAddress);
    }


    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (emailid != email.emailid) return false;
        if (emailAddress != null ? !emailAddress.equals(email.emailAddress) : email.emailAddress != null) return false;
        if (entityid != null ? !entityid.equals(email.entityid) : email.entityid != null) return false;
        if (personid != null ? !personid.equals(email.personid) : email.personid != null) return false;
        if (employeeid != null ? !employeeid.equals(email.employeeid) : email.employeeid != null) return false;
        if (clientid != null ? !clientid.equals(email.clientid) : email.clientid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = emailid;
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (entityid != null ? entityid.hashCode() : 0);
        result = 31 * result + (personid != null ? personid.hashCode() : 0);
        result = 31 * result + (employeeid != null ? employeeid.hashCode() : 0);
        result = 31 * result + (clientid != null ? clientid.hashCode() : 0);
        return result;
    }
}
