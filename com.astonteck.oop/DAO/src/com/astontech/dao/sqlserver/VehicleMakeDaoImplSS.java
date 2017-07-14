package com.astontech.dao.sqlserver;


import com.astontech.bo.Vehiclemake;
import com.astontech.dao.VehicleMakeDAO;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adrian.Flak on 5/25/2017.
 */
public class VehicleMakeDaoImplSS extends SQLServer implements VehicleMakeDAO {
    @Override
    public Vehiclemake selectVehicleMakeId(String vehiclemakeId) {
        Connect();
        Vehiclemake vehiclemake = null; //null so if no records returned no memory used
        try {
            String sp = "{call usp_SelectVehiclemake(?)}";
            CallableStatement cStmt = connection.prepareCall(sp);

            cStmt.setString(1, vehiclemakeId);

            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            if(rs.next()) {
                vehiclemake = HydrateObject(rs);
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }
        return vehiclemake;
    }

    @Override
    public List<Vehiclemake> selectVehicleMakesAll() {
        Connect();
        List<Vehiclemake> vehiclemakeList  = new ArrayList<>();
        try {
            String sp = "{call usp_SelectVehiclemakesAll()}";
            CallableStatement cStmt = connection.prepareCall(sp);


            ResultSet rs = cStmt.executeQuery();

            //region Hydrating an Object
            while (rs.next()) {

                vehiclemakeList.add(HydrateObject(rs));
            }
            //endregion

        } catch (SQLException sqlEx) {
            logger.error(sqlEx);
        }

        return vehiclemakeList;
    }

    @Override
    public int insertVehiclemake(Vehiclemake vehiclemake) {
        return 0;
    }

    @Override
    public boolean updateVehiclemake(Vehiclemake vehiclemake) {
        return false;
    }

    @Override
    public boolean deleteVehiclemake(String vehiclemakeId) {
        return false;
    }

    private static Vehiclemake HydrateObject(ResultSet rs) throws SQLException {

        Vehiclemake vehiclemake = new Vehiclemake();
        vehiclemake.setVehicleMakeid(rs.getInt(1));
        vehiclemake.setVehicleMakeName(rs.getString(2));
        vehiclemake.setCreateDate(rs.getTimestamp(3));

        return vehiclemake;
    }
}