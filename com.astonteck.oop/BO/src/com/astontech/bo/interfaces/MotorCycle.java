package com.astontech.bo.interfaces;

import com.astontech.bo.Vehicle;
import com.astontech.bo.Vehiclemake;
import com.astontech.bo.Vehiclemodel;

/**
 * Created by Adrian.Flak on 5/23/2017.
 */
public class MotorCycle implements IVehicle{

    //region Parameters
    private Vehiclemake vehicleMakeName;
    private Vehiclemodel vehicleModelName;
    private Vehicle year;
    private int numberOfWheels;
    private int numberOfFrontDoors;
    private int numberOfRearDoors;
    //endregion

    //region Setters//Getters
    public Vehiclemake getVehicleMakeName() {
        return vehicleMakeName;
    }

    public void setVehicleMakeName(Vehiclemake vehicleMakeName) {
        this.vehicleMakeName = vehicleMakeName;
    }

    public Vehiclemodel getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(Vehiclemodel vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public Vehicle getYear() {
        return year;
    }

    public void setYear(Vehicle year) {
        this.year = year;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getNumberOfFrontDoors() {
        return numberOfFrontDoors;
    }

    public void setNumberOfFrontDoors(int numberOfFrontDoors) {
        this.numberOfFrontDoors = numberOfFrontDoors;
    }

    public int getNumberOfRearDoors() {
        return numberOfRearDoors;
    }

    public void setNumberOfRearDoors(int numberOfRearDoors) {
        this.numberOfRearDoors = numberOfRearDoors;
    }
    //endregion

    //region Interface Overriders
    @Override
    public boolean isMadeAfter2000(){
        return (this.year.getYear() > 2000);
    }

    @Override
    public int numberOfWheels(){return getNumberOfWheels();}

    @Override
    public int numberOfDoors(){return 0;}

    @Override
    public String getMakeAndModel(){
        return "Make: " + this.vehicleMakeName.getVehicleMakeName() + ", Model: " + this.vehicleModelName.getVehicleModelName();
    }
    //endregion

}
