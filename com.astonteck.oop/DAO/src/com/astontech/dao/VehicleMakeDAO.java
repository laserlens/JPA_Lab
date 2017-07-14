package com.astontech.dao;

import com.astontech.bo.Vehiclemake;

import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public interface VehicleMakeDAO {

    //region select methods
    Vehiclemake selectVehicleMakeId(String vehiclemakeId);
    List<Vehiclemake> selectVehicleMakesAll();
    //endregion

    //region insert,update,delete methods
    int insertVehiclemake (Vehiclemake vehiclemake);
    boolean updateVehiclemake (Vehiclemake vehiclemake);
    boolean deleteVehiclemake (String vehiclemakeId);
    //endregion

}
