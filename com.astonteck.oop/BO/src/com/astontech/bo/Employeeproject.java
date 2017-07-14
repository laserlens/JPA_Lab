package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Employeeproject extends BaseBo{
    private int employeeProjectid;
    private int projectid;
    private int employeeid;
    private int entityTypeid;
    private Integer vehicleid;
    private Timestamp statDate;
    private Timestamp endDate;
    private String notes;

    @Basic
    @Column(name = "EmployeeProjectid")
    public int getEmployeeProjectid() {
        return employeeProjectid;
    }

    public void setEmployeeProjectid(int employeeProjectid) {
        this.employeeProjectid = employeeProjectid;
    }

    @Basic
    @Column(name = "Projectid")
    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    @Basic
    @Column(name = "Employeeid")
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
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
    @Column(name = "Vehicleid")
    public Integer getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }

    @Basic
    @Column(name = "StatDate")
    public Timestamp getStatDate() {
        return statDate;
    }

    public void setStatDate(Timestamp statDate) {
        this.statDate = statDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Basic
    @Column(name = "Notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employeeproject that = (Employeeproject) o;

        if (employeeProjectid != that.employeeProjectid) return false;
        if (projectid != that.projectid) return false;
        if (employeeid != that.employeeid) return false;
        if (entityTypeid != that.entityTypeid) return false;
        if (vehicleid != null ? !vehicleid.equals(that.vehicleid) : that.vehicleid != null) return false;
        if (statDate != null ? !statDate.equals(that.statDate) : that.statDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeProjectid;
        result = 31 * result + projectid;
        result = 31 * result + employeeid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (vehicleid != null ? vehicleid.hashCode() : 0);
        result = 31 * result + (statDate != null ? statDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
