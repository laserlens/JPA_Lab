package com.astontech.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import java.util.Date;


/**
 * Created by Adrian.Flak on 5/17/2017.
 */
@Entity
public class Vehicle extends BaseBo implements Comparable{

    //region Properties
    private int vehicleid;
    private Integer year;
    private String licensePlate;
    private String vin;
    private String color;
    private int isPurchase;
    private Integer purchasePrice;
    private Date purchaseDate;
    private int vehicleModelid;
    //endregion

    //region Setters/Getters
    @Basic
    @Column(name = "Vehicleid")
    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
    }

    @Basic
    @Column(name = "Year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "LicensePlate")
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Basic
    @Column(name = "VIN")
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Basic
    @Column(name = "Color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "IsPurchase")
    public Integer getIsPurchase() {
        return isPurchase;
    }

    public void setIsPurchase(Integer isPurchase) {
        this.isPurchase = isPurchase;
    }

    @Basic
    @Column(name = "PurchasePrice")
    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    @Basic
    @Column(name = "PurchaseDate")
    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    @Basic
    @Column(name = "VehicleModelid")
    public int getVehicleModelid() {
        return vehicleModelid;
    }

    public void setVehicleModelid(int vehicleModelid) {
        this.vehicleModelid = vehicleModelid;
    }

    //endregion

    //region constructors
    public Vehicle(){}

    public Vehicle(Integer year){
        this.year = year;
    }

    public Vehicle(Integer year, String licensePlate, String color, String vin ) {
        this.year = year;
        this.licensePlate =licensePlate;
        this.color = color;
        this.vin = vin;
    }
    //endregion

    //region comparable
    public int compareTo(Object temp){
        Vehicle other = (Vehicle) temp;
        return (getYear() > other.getYear()) ?1:(getYear() < other.getYear()) ?-1:0;
    }
    //endregion

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (vehicleid != vehicle.vehicleid) return false;
        if (vehicleModelid != vehicle.vehicleModelid) return false;
        if (year != null ? !year.equals(vehicle.year) : vehicle.year != null) return false;
        if (licensePlate != null ? !licensePlate.equals(vehicle.licensePlate) : vehicle.licensePlate != null)
            return false;
        if (vin != null ? !vin.equals(vehicle.vin) : vehicle.vin != null) return false;
        if (color != null ? !color.equals(vehicle.color) : vehicle.color != null) return false;
        if (isPurchase != vehicle.isPurchase) return false;
        if (purchasePrice != null ? !purchasePrice.equals(vehicle.purchasePrice) : vehicle.purchasePrice != null)
            return false;
        if (purchaseDate != null ? !purchaseDate.equals(vehicle.purchaseDate) : vehicle.purchaseDate != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleid;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (licensePlate != null ? licensePlate.hashCode() : 0);
        result = 31 * result + (vin != null ? vin.hashCode() : 0);
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + isPurchase;
        result = 31 * result + (purchasePrice != null ? purchasePrice.hashCode() : 0);
        result = 31 * result + (purchaseDate != null ? purchaseDate.hashCode() : 0);
        result = 31 * result + vehicleModelid;
        return result;
    }
}
