package com.astontech.dao;

import com.astontech.bo.Vehiclemodel;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public interface VehicleModelDAO {

    //region select methods
    Vehiclemodel selectVehicleModelId(int vehicleModelId);
    List<Vehiclemodel> selectVehicleModelsAll();
    //endregion

    //region insert,update,delete methods
    int insertVehicleModel (Vehiclemodel vehiclemodel);
    boolean updateVehicleModel (Vehiclemodel vehiclemodel);
    boolean deleteVehicleModel (int vehicleModelId);
    //endregion

}
