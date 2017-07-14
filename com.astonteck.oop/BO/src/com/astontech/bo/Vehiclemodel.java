package com.astontech.bo;

import jdk.nashorn.internal.ir.IfNode;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;


/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Vehiclemodel extends Vehicle{

    //region Properties
    private int vehicleModelid;
    private String vehicleModelName;
    private int vehicleMakeid;
    //endregion

    //region getters/setters
    @Basic
    @Column(name = "VehicleModelid")
    public int getVehicleModelid() {
        return vehicleModelid;
    }

    public void setVehicleModelid(int vehicleModelid) {
        this.vehicleModelid = vehicleModelid;
    }

    @Basic
    @Column(name = "VehicleModelName")
    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    @Basic
    @Column(name = "VehicleMakeid")
    public int getVehicleMakeid() {
        return vehicleMakeid;
    }

    public void setVehicleMakeid(int vehicleMakeid) {
        this.vehicleMakeid = vehicleMakeid;
    }

    public String getAllVehicleInfo(){
        return getVehicleModelName() + " " + getYear().toString() + " " +
                getColor() + " " + getLicensePlate() + " " + getVin() + " "
                + purchaseYesNo();
    }

    public String purchaseYesNo(){
        String yesNo = (this.getIsPurchase() == 0) ? "No" : "Yes";
        String purchaseData = (yesNo == "No") ?
                "Not Purchased" : this.getPurchaseDate().toString() +
                " For: $" + this.getPurchasePrice().toString();
        return "Is Purchased: " + yesNo + " Purchased Date: " +purchaseData;
    }



    //endregion

    //region Constructors
    public Vehiclemodel (){
    }

    public Vehiclemodel (String vehicleModelName){
        this.vehicleModelName = vehicleModelName;
    }

    public Vehiclemodel (String vehicleModelName,Integer year,String licensePlate,
                         String color, String vin, Integer isPurchased,
                         Date purchaseDate, Integer purchasePrice){
        this.vehicleModelName = vehicleModelName;
        this.setYear(year);
        this.setColor(color);
        this.setLicensePlate(licensePlate);
        this.setVin(vin);
        this.setIsPurchase(isPurchased);
        this.setPurchaseDate(purchaseDate);
        this.setPurchasePrice(purchasePrice);
    }
    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehiclemodel that = (Vehiclemodel) o;

        if (vehicleModelid != that.vehicleModelid) return false;
        if (vehicleModelName != null ? !vehicleModelName.equals(that.vehicleModelName) : that.vehicleModelName != null)
            return false;
        if (vehicleMakeid != that.vehicleMakeid)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleModelid;
        result = 31 * result + (vehicleModelName != null ? vehicleModelName.hashCode() : 0);
        result = 31 * result + vehicleMakeid;
        return result;
    }


}
