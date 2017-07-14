package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Projectstatus extends BaseBo {
    private int projectStatusid;
    private int projectid;
    private int entityTypeid;
    private String notes;
    private Integer percentComplete;
    private Timestamp startDate;
    private Timestamp endDate;

    @Basic
    @Column(name = "ProjectStatusid")
    public int getProjectStatusid() {
        return projectStatusid;
    }

    public void setProjectStatusid(int projectStatusid) {
        this.projectStatusid = projectStatusid;
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
    @Column(name = "EntityTypeid")
    public int getEntityTypeid() {
        return entityTypeid;
    }

    public void setEntityTypeid(int entityTypeid) {
        this.entityTypeid = entityTypeid;
    }

    @Basic
    @Column(name = "Notes")
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "PercentComplete")
    public Integer getPercentComplete() {
        return percentComplete;
    }

    public void setPercentComplete(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }

    @Basic
    @Column(name = "StartDate")
    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "EndDate")
    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Projectstatus that = (Projectstatus) o;

        if (projectStatusid != that.projectStatusid) return false;
        if (projectid != that.projectid) return false;
        if (entityTypeid != that.entityTypeid) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (percentComplete != null ? !percentComplete.equals(that.percentComplete) : that.percentComplete != null)
            return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectStatusid;
        result = 31 * result + projectid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (percentComplete != null ? percentComplete.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
