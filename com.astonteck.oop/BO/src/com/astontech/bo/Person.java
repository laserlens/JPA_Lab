package com.astontech.bo;

import common.helpers.StringHelper;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Person extends BaseBo{
    //region Properties
    private int personid;
    private String title;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String displayFirstName;
    private Byte isDelete;
    //list of emails
    private List<Email> emails;

    //endregion

    //region getters/setters


    @Id
    @Column(name = "Personid")
    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "CreateDate")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "DisplayFirstName")
    public String getDisplayFirstName() {
        return displayFirstName;
    }

    public void setDisplayFirstName(String displayFirstName) {
        this.displayFirstName = displayFirstName;
    }

    @Basic
    @Column(name = "IsDelete")
    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public String GetFullName (){
        if (StringHelper.isNullOrEmpty(this.firstName) && StringHelper.isNullOrEmpty(this.lastName)){
            return "No Name Set" ;
        }

        else {
            if (StringHelper.isNullOrEmpty(this.firstName))
                return this.lastName;
            else if (StringHelper.isNullOrEmpty(this.lastName))
                return this.firstName;
            else
                return this.firstName + " " + this.lastName;
        }
    }
    //endregion

    //region Constructors
    public Person(){
        this.setEmails(new ArrayList<>());
    }

    public Person(String title, String firstName, String lastName, Date birthDate, String displayFirstName) {
        this.setEmails(new ArrayList<>());
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.displayFirstName = displayFirstName;
    }

    //endregion

    //region comparable
    public int compareTo(Object temp){
        Person other = (Person) temp;
        return (getPersonid() > other.getPersonid()) ?1:
                (getPersonid() > other.getPersonid()) ?-1:0;
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (personid != person.personid) return false;
        if (title != null ? !title.equals(person.title) : person.title != null) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null) return false;
        if (birthDate != person.birthDate) return false;
        if (displayFirstName != null ? !displayFirstName.equals(person.displayFirstName) : person.displayFirstName != null)
            return false;
        if (isDelete != null ? !isDelete.equals(person.isDelete) : person.isDelete != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = personid;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (displayFirstName != null ? displayFirstName.hashCode() : 0);
        result = 31 * result + (isDelete != null ? isDelete.hashCode() : 0);
        return result;
    }



}
