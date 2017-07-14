package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Vehiclestatus extends BaseBo{
    private int vehicleStatusid;
    private int vehicleid;
    private int entityTypeid;
    private String notes;
    private Timestamp createDate;

    @Basic
    @Column(name = "VehicleStatusid")
    public int getVehicleStatusid() {
        return vehicleStatusid;
    }

    public void setVehicleStatusid(int vehicleStatusid) {
        this.vehicleStatusid = vehicleStatusid;
    }

    @Basic
    @Column(name = "Vehicleid")
    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
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

        Vehiclestatus that = (Vehiclestatus) o;

        if (vehicleStatusid != that.vehicleStatusid) return false;
        if (vehicleid != that.vehicleid) return false;
        if (entityTypeid != that.entityTypeid) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleStatusid;
        result = 31 * result + vehicleid;
        result = 31 * result + entityTypeid;
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }
}
