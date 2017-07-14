package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Project extends BaseBo {
    private int projectid;
    private int clientid;
    private int entityTypeid;
    private Integer rate;
    private Timestamp startDate;
    private Timestamp endDate;
    private String projectName;

    @Basic
    @Column(name = "Projectid")
    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    @Basic
    @Column(name = "Clientid")
    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
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
    @Column(name = "Rate")
    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
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

    @Basic
    @Column(name = "ProjectName")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (projectid != project.projectid) return false;
        if (clientid != project.clientid) return false;
        if (entityTypeid != project.entityTypeid) return false;
        if (rate != null ? !rate.equals(project.rate) : project.rate != null) return false;
        if (startDate != null ? !startDate.equals(project.startDate) : project.startDate != null) return false;
        if (endDate != null ? !endDate.equals(project.endDate) : project.endDate != null) return false;
        if (projectName != null ? !projectName.equals(project.projectName) : project.projectName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectid;
        result = 31 * result + clientid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        return result;
    }
}
