package com.astontech.dao.sqlserver;


import com.astontech.bo.Vehiclemodel;
import com.astontech.dao.EmployeeDAO;
import com.astontech.dao.VehicleModelDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class VehicleModelDaoImplSS extends SQLServer implements VehicleModelDAO {
    @Override
    public Vehiclemodel selectVehicleModelId(int vehicleModelId) {
        Connect();
        Vehiclemodel vehiclemodel = null; //null so if no records returned no memory used
        try {
            String sp = "{call usp_SelectVehiclemodel(?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setInt(1, vehicleModelId);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            if(rs.next()) {
                vehiclemodel = HydrateObject(rs);
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return vehiclemodel;
    }

    @Override
    public List<Vehiclemodel> selectVehicleModelsAll() {
        Connect();
        List<Vehiclemodel> vehiclemodelList  = new ArrayList<>();
        try {
            String sp = "{call usp_SelectVehiclemodelsAll()}";
            CallableStatement cStmt = connection.prepareCall(sp);


            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while (rs.next()) {

                vehiclemodelList.add(HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return vehiclemodelList;
    }

    @Override
    public int insertVehicleModel(Vehiclemodel vehiclemodel) {
        return 0;
    }

    @Override
    public boolean updateVehicleModel(Vehiclemodel vehiclemodel) {
        return false;
    }

    @Override
    public boolean deleteVehicleModel(int vehicleModelId) {
        return false;
    }

    private static Vehiclemodel HydrateObject(ResultSet rs) throws SQLException {

        Vehiclemodel vehiclemodel = new Vehiclemodel();
        vehiclemodel.setVehicleModelid(rs.getInt(1));
        vehiclemodel.setVehicleModelName(rs.getString(2));
        vehiclemodel.setVehicleMakeid(rs.getInt(3));

        return vehiclemodel;
    }
}