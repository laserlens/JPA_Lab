package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Review extends BaseBo {
    private int reviewid;
    private String reviewName;
    private Timestamp reviewDate;
    private int employeeid;

    @Basic
    @Column(name = "Reviewid")
    public int getReviewid() {
        return reviewid;
    }

    public void setReviewid(int reviewid) {
        this.reviewid = reviewid;
    }

    @Basic
    @Column(name = "ReviewName")
    public String getReviewName() {
        return reviewName;
    }

    public void setReviewName(String reviewName) {
        this.reviewName = reviewName;
    }

    @Basic
    @Column(name = "ReviewDate")
    public Timestamp getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Timestamp reviewDate) {
        this.reviewDate = reviewDate;
    }

    @Basic
    @Column(name = "Employeeid")
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Review review = (Review) o;

        if (reviewid != review.reviewid) return false;
        if (employeeid != review.employeeid) return false;
        if (reviewName != null ? !reviewName.equals(review.reviewName) : review.reviewName != null) return false;
        if (reviewDate != null ? !reviewDate.equals(review.reviewDate) : review.reviewDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = reviewid;
        result = 31 * result + (reviewName != null ? reviewName.hashCode() : 0);
        result = 31 * result + (reviewDate != null ? reviewDate.hashCode() : 0);
        result = 31 * result + employeeid;
        return result;
    }
}
