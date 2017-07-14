package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Vehiclemake extends BaseBo{

    //region Properties
    private int vehicleMakeid;
    private String vehicleMakeName;
    private Timestamp createDate;
    private List<Vehiclemodel> vehicles;
    //endregion

    //region getter/setter
    @Id
    @Column(name = "VehicleMakeid")
    public int getVehicleMakeid() {
        return vehicleMakeid;
    }

    public void setVehicleMakeid(int vehicleMakeid) {
        this.vehicleMakeid = vehicleMakeid;
    }

    @Basic
    @Column(name = "VehicleMakeName")
    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    public void setVehicleMakeName(String vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
    }

    @Basic
    @Column(name = "CreateDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public List<Vehiclemodel> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehiclemodel> vehicles) {
        this.vehicles = vehicles;
    }
    //endregion

    //region constructors

    public Vehiclemake () {
        this.setVehicles(new ArrayList<>());
    }

    public Vehiclemake (String vehicleMakeName) {
        this.setVehicles(new ArrayList<>());
        this.vehicleMakeName = vehicleMakeName;
    }


    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiclemake that = (Vehiclemake) o;

        if (vehicleMakeid != that.vehicleMakeid) return false;
        if (vehicleMakeName != null ? !vehicleMakeName.equals(that.vehicleMakeName) : that.vehicleMakeName != null)
            return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleMakeid;
        result = 31 * result + (vehicleMakeName != null ? vehicleMakeName.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }


}
