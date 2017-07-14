package com.astontech.dao;

import com.astontech.bo.Vehicle;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public interface VehicleDAO {

    //region select methods
    Vehicle selectVehicleId(int vehiclelId);
    List<Vehicle> selectVehiclesAll();
    //endregion

    //region insert,update,delete methods
    int insertVehicle (Vehicle vehicle);
    boolean updateVehicle (Vehicle vehicle);
    boolean deleteVehicle (Vehicle vehicle);
    //endregion

}
