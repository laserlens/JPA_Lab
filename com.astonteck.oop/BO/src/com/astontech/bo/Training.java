package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Training extends BaseBo{
    private int trainingid;
    private int employeeid;
    private String trainingName;
    private Timestamp createDate;

    @Basic
    @Column(name = "Trainingid")
    public int getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(int trainingid) {
        this.trainingid = trainingid;
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
    @Column(name = "TrainingName")
    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    @Basic
    @Column(name = "CreateDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Training training = (Training) o;

        if (trainingid != training.trainingid) return false;
        if (employeeid != training.employeeid) return false;
        if (trainingName != null ? !trainingName.equals(training.trainingName) : training.trainingName != null)
            return false;
        if (createDate != null ? !createDate.equals(training.createDate) : training.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trainingid;
        result = 31 * result + employeeid;
        result = 31 * result + (trainingName != null ? trainingName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
