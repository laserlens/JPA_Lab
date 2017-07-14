package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Reviewdata extends BaseBo{
    private int reviewDataid;
    private int reviewid;
    private int entityTypeid;
    private String reviewDataVale;
    private Timestamp createDate;

    @Basic
    @Column(name = "ReviewDataid")
    public int getReviewDataid() {
        return reviewDataid;
    }

    public void setReviewDataid(int reviewDataid) {
        this.reviewDataid = reviewDataid;
    }

    @Basic
    @Column(name = "Reviewid")
    public int getReviewid() {
        return reviewid;
    }

    public void setReviewid(int reviewid) {
        this.reviewid = reviewid;
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
    @Column(name = "ReviewDataVale")
    public String getReviewDataVale() {
        return reviewDataVale;
    }

    public void setReviewDataVale(String reviewDataVale) {
        this.reviewDataVale = reviewDataVale;
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

        Reviewdata that = (Reviewdata) o;

        if (reviewDataid != that.reviewDataid) return false;
        if (reviewid != that.reviewid) return false;
        if (entityTypeid != that.entityTypeid) return false;
        if (reviewDataVale != null ? !reviewDataVale.equals(that.reviewDataVale) : that.reviewDataVale != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewDataid;
        result = 31 * result + reviewid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (reviewDataVale != null ? reviewDataVale.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
