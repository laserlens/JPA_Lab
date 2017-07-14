package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import java.util.Arrays;
import java.util.Date;

@Entity
public class Employee extends Person {

    //region Properties
    private String title;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private Date hireDate;
    private String loyaltyCompany;
    private String loyaltyCompanyMemberNumber;
    private byte[] loyaltyCompanyName;
    private Date termdate;
    private Date birthDate;
    private Date createDate;
    private int personid;
    private int employeeid;
    //endregion

    //region constructor

    public Employee(){}

    public Employee(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public Employee(int employeeId, String firstName){
        this.setEmployeeid(employeeId);
        this.setFirstName(firstName);
    }
    //endregion

    //region getters/setters
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
    @Column(name = "EmailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "HireDate")
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    @Basic
    @Column(name = "LoyaltyCompany")
    public String getLoyaltyCompany() {
        return loyaltyCompany;
    }

    public void setLoyaltyCompany(String loyaltyCompany) {
        this.loyaltyCompany = loyaltyCompany;
    }

    @Basic
    @Column(name = "LoyaltyCompanyMemberNumber")
    public String getLoyaltyCompanyMemberNumber() {
        return loyaltyCompanyMemberNumber;
    }

    public void setLoyaltyCompanyMemberNumber(String loyaltyCompanyMemberNumber) {
        this.loyaltyCompanyMemberNumber = loyaltyCompanyMemberNumber;
    }

    @Basic
    @Column(name = "LoyaltyCompanyName")
    public byte[] getLoyaltyCompanyName() {
        return loyaltyCompanyName;
    }

    public void setLoyaltyCompanyName(byte[] loyaltyCompanyName) {
        this.loyaltyCompanyName = loyaltyCompanyName;
    }

    @Basic
    @Column(name = "Termdate")
    public Date getTermdate() {
        return termdate;
    }

    public void setTermdate(Date termdate) {
        this.termdate = termdate;
    }

    @Basic
    @Column(name = "BirthDate")
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "CreateDate")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "Personid")
    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    @Id
    @Column(name = "Employeeid")
    public int getEmployeeid() {
        return employeeid;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    //endregion


        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeid != employee.employeeid) return false;
        if (title != null ? !title.equals(employee.title) : employee.title != null) return false;
        if (firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) return false;
        if (lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null) return false;
        if (emailAddress != null ? !emailAddress.equals(employee.emailAddress) : employee.emailAddress != null)
            return false;
        if (hireDate != null ? !hireDate.equals(employee.hireDate) : employee.hireDate != null) return false;
        if (loyaltyCompany != null ? !loyaltyCompany.equals(employee.loyaltyCompany) : employee.loyaltyCompany != null)
            return false;
        if (loyaltyCompanyMemberNumber != null ? !loyaltyCompanyMemberNumber.equals(employee.loyaltyCompanyMemberNumber) : employee.loyaltyCompanyMemberNumber != null)
            return false;
        if (!Arrays.equals(loyaltyCompanyName, employee.loyaltyCompanyName)) return false;
        if (termdate != null ? !termdate.equals(employee.termdate) : employee.termdate != null) return false;
        if (birthDate != null ? !birthDate.equals(employee.birthDate) : employee.birthDate != null) return false;
        if (createDate != null ? !createDate.equals(employee.createDate) : employee.createDate != null) return false;
        if (personid != employee.personid) return false;

        return true;
    }



    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (hireDate != null ? hireDate.hashCode() : 0);
        result = 31 * result + (loyaltyCompany != null ? loyaltyCompany.hashCode() : 0);
        result = 31 * result + (loyaltyCompanyMemberNumber != null ? loyaltyCompanyMemberNumber.hashCode() : 0);
        result = 31 * result + (loyaltyCompanyName != null ? Arrays.hashCode(loyaltyCompanyName) : 0);
        result = 31 * result + (termdate != null ? termdate.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + personid;
        result = 31 * result + employeeid;
        return result;
    }




}
