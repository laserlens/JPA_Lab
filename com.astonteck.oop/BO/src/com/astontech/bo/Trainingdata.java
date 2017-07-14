package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Trainingdata extends BaseBo{
    private int trainingDateid;
    private int trainingid;
    private int entityTypeid;
    private String trainingDataValue;
    private Timestamp createDate;

    @Basic
    @Column(name = "TrainingDateid")
    public int getTrainingDateid() {
        return trainingDateid;
    }

    public void setTrainingDateid(int trainingDateid) {
        this.trainingDateid = trainingDateid;
    }

    @Basic
    @Column(name = "Trainingid")
    public int getTrainingid() {
        return trainingid;
    }

    public void setTrainingid(int trainingid) {
        this.trainingid = trainingid;
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
    @Column(name = "TrainingDataValue")
    public String getTrainingDataValue() {
        return trainingDataValue;
    }

    public void setTrainingDataValue(String trainingDataValue) {
        this.trainingDataValue = trainingDataValue;
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

        Trainingdata that = (Trainingdata) o;

        if (trainingDateid != that.trainingDateid) return false;
        if (trainingid != that.trainingid) return false;
        if (entityTypeid != that.entityTypeid) return false;
        if (trainingDataValue != null ? !trainingDataValue.equals(that.trainingDataValue) : that.trainingDataValue != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = trainingDateid;
        result = 31 * result + trainingid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (trainingDataValue != null ? trainingDataValue.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
